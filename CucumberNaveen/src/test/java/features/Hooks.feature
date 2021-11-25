Feature: Hooks

@Smoke @Regression @EndtoEnd
Scenario: login into portal
Given user logs into portal


@Smoke
Scenario: user product search
Given user searches for product


@Smoke @Regression @EndtoEnd
Scenario: user adds a product into basket
Given user adds a product to bag

@Third
@Regression
Scenario: user searches for orders
Given user in order history page


@Regression @EndtoEnd
Scenario: user registration
Given user signs up

@First
@EndtoEnd
Scenario: User orders for a product 
Given user orders a aproduct


@Regression
Scenario: newsletter subscription
Given subscribes for a product


@EndtoEnd
Scenario: change of password
Given user changes password

@Second
@Smoke @EndtoEnd
Scenario: Checking order status
Given user checks order status

@Regression @EndtoEnd
Scenario: add too fav
Given user adds product to fav