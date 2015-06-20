'use strict';

angular.module('ozayApp')
.controller('RoleController', function ($rootScope, $scope, $cookieStore, Session, $state, $location, $stateParams, Role) {
	Role.query({method:"building", buildingId:$stateParams.buildingId}).$promise.then(function(roles) {
		$scope.roles = roles;
	}, function(error){

	});
	$scope.organizationId =$stateParams.organizationId
	$scope.buildingId = $stateParams.buildingId;
})
.controller('RoleDetailController', function ($rootScope, $scope, $cookieStore, Session, $state, $stateParams, Permission, Role) {

	if($state.current.name != 'home.role_edit' && $state.current.name != 'home.role_create'){
		$state.go('error');
	}
	$scope.role = {};

	$scope.access = [];
	$scope.accessList = [];
	$scope.buildingId = $stateParams.buildingId;
	$scope.organizationId = $stateParams.organizationId;

	Permission.query({method:"role"}).$promise.then(function(permissions) {
		$scope.permissions = permissions;
		if(permissions.length > 0){
			for(var i = 0; i< permissions.length;i++){
				$scope.accessList.push({
					name: permissions[i].name,
					label:permissions[i].label,
				});
			}
			$scope.showPermissions = true;
		}
	}, function(error){

	});


	Role.query({method:"building", buildingId:$stateParams.buildingId}).$promise.then(function(roles) {
		$scope.roles = roles;
		if(roles.length > 0){
			$scope.showRoles = true;
		}

	}, function(error){

	});

	$scope.button = true;


	if($state.current.name == 'home.role_edit'){

		Role.get({roleId:$stateParams.roleId}).$promise.then(function(role) {

			$scope.role = role;
			$scope.edit_text = true;
			if(role.rolePermissions.length == 0){
			    $scope.role.rolePermissions = [];
			} else{
			    for(var i = 0; i< $scope.role.rolePermissions.length;i++){
			        var index = $scope.role.rolePermissions[i].name;
			        $scope.access[index] = true;
			    }
			}


		}, function(error){
			//$state.go('home.home');
		});
	} else{
		$scope.create_text = true;
		$scope.role.rolePermissions = [];
	}

	$scope.rolePermissionsClicked = function(value, modelValue){

            if(modelValue == true){
                $scope.role.rolePermissions.push({name:value});
            } else {
                for(var i = 0; i< $scope.role.rolePermissions.length; i++){
                    if(value == $scope.role.rolePermissions[i].name){
                        $scope.role.rolePermissions.splice(i, 1);
                    }
            }
            console.log($scope.role.rolePermissions);
        }
	}

	$scope.create = function () {
		$scope.button = false;
		var confirm = ("Would you like to save?");
		if(confirm){
		    $scope.role.buildingId = $stateParams.buildingId;
			if($scope.role.id === undefined || $scope.role.id == 0){
				Role.save($scope.role,
						function (data) {
					$scope.showSuccessAlert = true;
					$scope.successTextAlert = data.response;
				}, function (error){
					$scope.showErrorAlert = true;
					$scope.errorTextAlert = "Error! Please try later.";
					$scope.button = true;
				});
			}
			else{
				Role.update($scope.role,
						function (data) {
					$scope.showSuccessAlert = true;
					$scope.successTextAlert = data.response;
				}, function (error){
					$scope.showErrorAlert = true;
					$scope.errorTextAlert = "Error! Please try later.";
					$scope.button = true;
				});
			}
		} else {
			$scope.button = true;
		}
	};
});