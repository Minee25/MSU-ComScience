import javax.sound.sampled.*;

public class UIIA {
    public static void main(String[] args) {
        int sampleRate = 44100; // อัตราสุ่มตัวอย่าง (Hz)

        try {
            AudioFormat format = new AudioFormat(sampleRate, 8, 1, true, false);
            SourceDataLine line = AudioSystem.getSourceDataLine(format);
            line.open(format);
            line.start();

            // ลำดับจังหวะที่ 1: "อุ-อิอิ-อ้า"
            playVowel(line, sampleRate, 250, 300); // อุ
            Thread.sleep(200);

            playVowel(line, sampleRate, 400, 200); // อิ
            Thread.sleep(100);
            playVowel(line, sampleRate, 400, 200); // อิ
            Thread.sleep(300);

            playVowel(line, sampleRate, 300, 900); // อ้า
            Thread.sleep(500);

            // ลำดับจังหวะที่ 2: "อุอิ-อิอ้า"
            playVowel(line, sampleRate, 250, 300); // อุ
            Thread.sleep(100);
            playVowel(line, sampleRate, 400, 300); // อิ
            Thread.sleep(200);

            playVowel(line, sampleRate, 400, 200); // อิ
            Thread.sleep(100);
            playVowel(line, sampleRate, 300, 900); // อ้า
            Thread.sleep(500);

            // ลำดับจังหวะที่ 3: "อุอิอิ-อ้า"
            playVowel(line, sampleRate, 250, 300); // อุ
            Thread.sleep(100);
            playVowel(line, sampleRate, 400, 200); // อิ
            Thread.sleep(100);
            playVowel(line, sampleRate, 400, 200); // อิ
            Thread.sleep(300);

            playVowel(line, sampleRate, 300, 900); // อ้า

            line.drain();
            line.close();
        } catch (LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void playVowel(SourceDataLine line, int sampleRate, int frequency, int durationMs) {
        int length = (int) ((durationMs / 1000.0) * sampleRate);
        byte[] buffer = new byte[length];

        for (int i = 0; i < length; i++) {
            double angle = 2.0 * Math.PI * i * frequency / sampleRate;
            buffer[i] = (byte) (Math.sin(angle) * 127); // สร้างคลื่นเสียง Sine
        }

        line.write(buffer, 0, buffer.length);
    }
}
