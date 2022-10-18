public class R15_SEC04_J {
    class SensitiveHash {
        private Hashtable<Integer,String> ht = new Hashtable<Integer,String>();

        public void removeEntry(Object key) {
            ht.remove(key);
        }
    }
}
