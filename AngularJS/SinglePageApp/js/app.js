var app = angular.module('app',['ngRoute']);

app.config(function($routeProvider) {
    $routeProvider

        //default page
        .when('/', {
            templateUrl : 'pages/homepage.html',
            controller  : 'Homepage'
        })

        //page2
        .when('/about', {
            templateUrl : 'pages/about.html',
            controller  : 'About'
        })

        //page2
        .when('/date', {
            templateUrl : 'pages/date.html',
            controller  : 'Date'
        });
});