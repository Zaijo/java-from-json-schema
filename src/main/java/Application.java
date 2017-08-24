import de.co.zet.experiments.jsonschema.SearchResponseError;

final class Application {
  public static void main(String... args) {
    SearchResponseError error = new SearchResponseError();
    error.setAdditionalProperty("bubu", "nieco");
    System.out.println(error);
  }
}