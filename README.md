# Tinker

> Because life's too short to fuss with setting up every one-off project

![](https://imgs.xkcd.com/comics/is_it_worth_the_time.png)


[xkcd: Is It Worth The Time](https://imgs.xkcd.com/comics/is_it_worth_the_time.png)

## What is it?

1. A no-setup-required scratch pad for a "scripting" session
2. A quick way to play with interesting libraries by including all the deps, and `:require`s you need

Overtime, your local copy of `tinker` will fill up with one-off scripts, scrapers, code from playing around trying to wrap your brain around `core.logic`, some random music experiment in `overtone`, etc. 

Bonus: when you need to find that utility function you wrote last year, it's located in `tinker`! instead of some random directory you probably accidentally deleted.

## Usage

1. `git clone` this
2. either:
    1. create a scratch namespace
    2. or go to the namespace for a lib you're interested in
3. Tinker!

Congrataulations, you just saved 30sec of setup time!

## Wanna add a Library?

1. add the required deps to `project.clj`
2. add a sensible namespace for tinkering around in
3. `:require` a sensible subset of functions/macros
4. PR that shiz! I'll be responsive!

## License

Copyright © 2017 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
