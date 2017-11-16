(defn square [x] (* x x))

(defn sum-of-squares [x y]
  (+ (square x) (square y)))

(defn sum-square-largest-two [x y z]
  (cond (and (> y x) (> z x)) (sum-of-squares y z)
        (and (> x y) (> z y)) (sum-of-squares x z)
        (and (> x z) (> y z)) (sum-of-squares x y)))
