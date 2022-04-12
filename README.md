# Spring 01 : Start

## Challenge
## Hello, I'm the Doctor

You will create some routes using a controller:

- Creates a Spring project, and transforms the application into a controller.
- Choose 4 people who played the character of the Doctor (see here for the complete list: https://en.wikipedia.org/wiki/The_Doctor_%28Doctor_Who%29#Actors).
- For each of the 4 incarnations you have chosen, create a /doctor/<number> route that returns the name corresponding to the number. For example:
    - for the url /doctor/1 : the method returns "William Hartnell".
    - for the url /doctor/10 : the method returns "David Tennant".
    - for the url /doctor/13 : the method returns "Jodie Whittaker".
- the root / returns a list of urls for which you have provided mappings, in the form of HTML links -- think of the tags <ul> and <li> to contain your tags <a>.

- Push your project content into a GitHub repository and post your repository link as a solution.

## Validation criterias
- The controller contains 5 routes.
- The first 4 routes return the name of an incarnation mapped to its number.
- The root returns the links to the other mappings.
- The code is available on GitHub.