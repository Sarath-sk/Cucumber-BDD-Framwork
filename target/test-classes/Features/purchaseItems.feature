Feature: checkout the selected items

@Order
Scenario Outline: Items purchase
Given landing on GreenKart home page
When user search with name "<name>" in homepage and increase item count by 3
And user check the cart value for selected items
Then user check out the selected items

Examples:
| name  |
| Tom   |
| Beet  |