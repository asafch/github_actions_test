(defproject com.asafch/github_actions_test "0.1.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :profiles {:dev     {:plugins      [[lein-eftest "0.5.9"]]
                       :dependencies [[org.clojure/clojure "1.10.1"]
                                      [clj-kondo "RELEASE"]]
                       :aliases      {"clj-kondo" ["run" "-m" "clj-kondo.main"]
                                      "lint"      ["run" "-m" "clj-kondo.main" "--lint" "src" "test"]}
                       :global-vars  {*warn-on-reflection* true}}
             :uberjar {:aot :all}}
  :main ^:skip-aot github-actions-test.core)
