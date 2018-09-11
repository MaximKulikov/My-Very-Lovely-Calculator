var app = angular.module('angularcalculatorsample', []);

app.controller('JavaFXWebDemoController', function ($scope) {

    //Kalkulachka
    $scope.calculatedResult = function () {
        return kalkulachkaService.loadResult();
    }

    $scope.plusOne = function () {
        kalkulachkaService.plusOne();
    }
    $scope.minusOne = function () {
        kalkulachkaService.minusOne();

    }
});

