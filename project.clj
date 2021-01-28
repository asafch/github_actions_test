(defproject org.clojars.asafch/github_actions_test "0.3.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://github.com/asafch/github_actions_test"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :deploy-repositories [["releases" {:url           "https://repo.clojars.org"
                                     :username      :env/clojars_username
                                     :password      :env/clojars_password
                                     :sign-releases false}]
                        ["snapshots" {:url           "https://repo.clojars.org"
                                      :username      :env/clojars_username
                                      :password      :env/clojars_password
                                      :sign-releases false}]]
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :profiles {:dev     {:plugins      [[lein-eftest "0.5.9"]]
                       :eftest       {:multithread?   false
                                      :report         eftest.report.junit/report
                                      :report-to-file "target/junit.xml"}
                       :dependencies [[org.clojure/clojure "1.10.1"]
                                      [clj-kondo "RELEASE"]]
                       :aliases      {"clj-kondo" ["run" "-m" "clj-kondo.main"]
                                      "lint"      ["run" "-m" "clj-kondo.main" "--lint" "src" "test"]}
                       :global-vars  {*warn-on-reflection* true}}
             ;:ci      {:local-repo "~/.m2/repository"}
             :uberjar {:aot :all}}
  :main ^:skip-aot github-actions-test.core)
