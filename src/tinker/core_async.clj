(ns tinker.core-async
  (:require [clojure.core.async
             :refer [<! <!!
                     >! >!!
                     alt! alt!! alts! alts!!
                     chan go timeout close!]
             :as a]))
