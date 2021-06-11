(ns com.vadelabs.machine.interface
  (:require
   [com.vadelabs.machine.core :as machine]))

(def operand-push machine/operand-push)
(def operand-pop machine/operand-pop)
(def operand-peek machine/operand-peek)
(def data machine/data)
(def code machine/code)
(def ip machine/ip)
(def call-stack machine/call-stack)
(def operand-stack machine/operand-stack)
(def execute machine/execute)
(def next-code machine/next-code)
(def make-machine machine/make-machine)
