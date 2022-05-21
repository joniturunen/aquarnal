package run.joni.aquarnalrest.data;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class EntryService {
    public List<Entry> getEntries() {
        return List.of(
                new Entry(
                        new HashMap<>() {{
                            put("temperature", 23.0);
                            put("nitrates", 0.0);
                            put("nitrites", 0.0);
                            put("ph", 7.0);
                        }},
                        "check"
                ),
                new Entry(
                        new HashMap<>() {{
                            put("otocinclus", 7.0);
                            put("co2", 20.0);
                        }},
                        "add"
                ),
                new Entry(
                        new HashMap<>() {{
                            put("waterLitres", 100.0);
                            put("aquaSafeMl", 50.0);
                        }},
                        "waterChange"
                )
        );
    }
}
