(ns binary-search)

(def l [1 3 5 6 9 10 12 22 23 24 26 29 30 31 32 37 38 39 40 42 44 45 46])

(defn search [i sortedList start end]
  (let [middle (Math/round (Math/floor (/ (+ start end) 2)))]
    (if (<= start end)
      (cond
        (= (get sortedList middle) i) middle
        (< (get sortedList middle) i) (search i sortedList (+ middle 1) end)
        :else (search i sortedList start (- middle 1))
       )
      -1)))

(defn binary-search [i sortedList]
  (let [start 0
        end (- (count sortedList) 1)]
    (search i sortedList start end)))

(binary-search 19 l)

