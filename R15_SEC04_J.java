public class R15_SEC04_J {
    class SensitiveHash {
        private Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

        public void removeEntry(Object key) {
            check("removeKeyPermission");
            ht.remove(key);
        }

        private void check(String directive) {
            SecurityManager sm = System.getSecurityManager();
            if (sm != null) {
                sm.checkSecurityAccess(directive);
            }
        }
    }
}
