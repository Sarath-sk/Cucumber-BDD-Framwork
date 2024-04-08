Feature: Search the product withe given name

@Search
Scenario Outline: Search product withe gievn name in home and top-delas page
Given user is on GreenKart Homepage
When user search with name <name> in homepage and extract the text
Then user search with name <name> in top-deals page and extract the text
And validate text in home and top-deals page

Examples:
| name |
| Tom  |
| Beet |