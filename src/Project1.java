public class Project1 {

    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.setSource("XML");
        personlist = factory.getPersonByName("name");
        factory.setSource("DB");
    }

    class Factory implements IFactoryObject {
        IFactoryObject source;

        @Override
        public Factory getPersonByName(String name) {
            source.getPersonByName(name);
            return;
        }

        @Override
        public void b() {

        }

        public void setSource(String name) {
            if (name == "XML") {
                source = new XMLFactoryObject();
            }
        }
    }

    class DBFactoryObject implements IFactoryObject {

        @Override
        public Factory getPersonByName(String name) {
            return null;
        }

        @Override
        public void b() {

        }
    }

    class XMLFactoryObject implements IFactoryObject {

        @Override
        public Factory getPersonByName(String name) {
            return null;
        }

        @Override
        public void b() {

        }
    }
}
