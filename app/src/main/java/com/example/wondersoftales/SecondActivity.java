package com.example.wondersoftales;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = new ListView(this);

        String[] stories = {
                "The Little Red Riding Hood.",
                "The Raven.",
                "Alice in the Wonderland.",
                "The Lion King.",
                "The Little Match Girl.",
                "The List of Blinds.",
                "Birbal's Khichdi.",
                "King Midas and the Golden touch.",
                "The Ugly Duckling.",
                "The Teddy's Magical Adventure.",
                "The Gingerbread Man.",
                "Cinderella",
                "Goldilocks and three Bears.",
                "The Velveteen Rabbit.",
                "The Snow white and seven dwarfs."
        };

        // Full story texts
        String[] fullStories = {
                "Once upon a time, in a small village in the middle of a big forest, lived a sweet little girl named Little Red Riding Hood. She got her name from the red hooded cloak her grandmother had made for her. Little Red loved to visit her grandmother, who lived on the other side of the woods.\n" +
                        "One sunny morning, her mother packed a basket with freshly baked goodies and a jar of honey for her grandmother. “Be careful, my dear,” her mother said. “Stay on the path and don’t talk to strangers.”Little Red promised to listen to her mother and set off on her journey with a skip in her step. She hummed a happy tune as she walked along the winding path through the magical forest.\n" +
                        "Little Red didn’t know that a sneaky wolf was watching her from the shadows. The wolf wanted the delicious treats she was carrying and came up with a plan to trick her.\n" +
                        "“Good morning, Little Red Riding Hood,” the wolf said, pretending to be friendly. “Where are you going with such a lovely basket?”\n" +
                        "\n" +
                        "“Oh, good morning, Mr. Wolf,” Little Red replied politely. “I’m going to visit my grandmother. She’s not feeling well, and I’m bringing her some goodies to make her feel better.”\n" +
                        "The wolf’s eyes sparkled with mischief. “That’s very kind of you. But don’t you think it would be nice to pick some flowers for your grandmother from the meadow over there? I’m sure she would love them.”\n" +
                        "Little Red thought it was a good idea and went into the meadow to pick some flowers. The wolf quickly ran to her grandmother’s cottage, hoping to get there before her.\n" +
                        "When he arrived at the cottage, the wolf found the grandmother resting in bed. He quickly locked her in the closet and put on her nightcap and glasses, pretending to be her.\n" +
                        "Meanwhile, Little Red finished picking flowers and arrived at her grandmother’s cottage. Knocking on the door, she called out, “Grandma, it’s me, Little Red Riding Hood. I’ve brought you some treats.”The wolf replied in a disguised voice, “Come in, my dear.”\n" +
                        "As Little Red entered the cottage, she noticed that her grandmother looked different. “Grandma, what big eyes you have,” she said, feeling suspicious.\n" +
                        "“The better to see you with, my dear,” the wolf replied, trying to sound like the grandmother.\n" +
                        "Little Red noticed other changes too. “Grandma, what big ears you have,” she said.\n" +
                        "“The better to hear you with, my dear,” the wolf replied, trying to hide his excitement.Finally, Little Red noticed the sharp teeth. “Grandma, what big teeth you have,” she said, now sure that something was wrong.\n" +
                        "“The better to eat you with!” the wolf shouted, throwing off the disguise and showing his true self.\n" +
                        "Terrified, Little Red ran to the door, but just as the wolf jumped towards her, a brave woodsman burst into the cottage. He had heard the noise and hurried to save Little Red and her grandmother.\n" +
                        "With a mighty swing of his axe, the woodsman scared the wolf away. Little Red and her grandmother were safe.\n" +
                        "From that day on, Little Red Riding Hood learned an important lesson about being careful and never talking to strangers. She thanked the brave woodsman for saving her and promised to be more careful in the future.",
                "Once upon a time, in a village nestled between rolling hills and lush forests, there lived a curious and kind-hearted young girl named Eileen. Eileen was known throughout the village for her adventurous spirit and love for exploring the wonders of nature.One sunny afternoon, as Eileen was wandering through the forest, she stumbled upon a magnificent oak tree towering high above the treetops. Perched atop a branch of the oak tree was a majestic raven with glossy black feathers that shimmered in the sunlight.\n" +
                        "“Hello, little one,” squawked the raven, its voice echoing through the forest. “I am Raven, the guardian of these woods. What brings you to my domain?”\n" +
                        "Eileen looked up in awe at the majestic bird and replied, “I’m on a quest to find the brightest star in the sky. I’ve heard it holds the key to granting wishes, and I want to make a wish for the well-being of my village.”The raven’s eyes sparkled with interest as it listened to Eileen’s quest. “Ah, the brightest star,” cawed the raven thoughtfully. “I know just the one you seek, but it lies beyond the edge of the forest, deep in the heart of the enchanted valley.”\n" +
                        "With a flap of its wings, the raven beckoned Eileen to follow as they embarked on a magical journey through the forest. Along the way, they encountered mystical creatures such as talking trees, mischievous fairies, and playful woodland creatures, each offering their guidance and wisdom to aid them on their quest.\n" +
                        "As they ventured deeper into the forest, the air grew thick with enchantment, and the trees whispered secrets of ancient magic. At last, they reached the edge of the forest and beheld the breathtaking sight of the enchanted valley bathed in the light of the moon.\n" +
                        "High above the valley, twinkling in the night sky, was the brightest star Eileen had ever seen. With a sense of wonder and awe, she made her wish for the well-being of her village, her heart filled with hope and love.\n" +
                        "Suddenly, the star began to shimmer and glow with a radiant light, illuminating the valley below in a dazzling display of magic. The raven let out a joyful caw as Eileen’s wish was granted, and the forest echoed with the sound of laughter and celebration.As they journeyed back home, Eileen and the raven shared stories and laughter, forging a bond of friendship that would last a lifetime. And as they bid farewell beneath the twinkling stars, Eileen knew that she would always cherish the memories of her magical adventure with her newfound friend, the friendly raven.\n" +
                        "And so, in the village nestled between rolling hills and lush forests, the legend of Eileen’s quest and the friendly raven lived on, inspiring generations to come with the power of friendship, courage, and the magic of the stars.\n" +
                        "The End!",
                "Once upon a time, in a charming English countryside, there lived a curious young girl named Alice. One sunny afternoon, Alice was sitting by a riverbank, feeling a little bored. She glanced up and noticed a white rabbit with pink eyes, dressed in a vest, hurrying by. The rabbit pulled out a pocket watch, saying loudly, “Oh dear! Oh dear! I shall be late!”Very interested, Alice jumped up and followed the rabbit. She watched as he disappeared into a large rabbit hole. Without thinking twice, Alice followed him down the hole and found herself falling down, down, down into a strange and wonderful world.\n" +
                        "Alice landed softly in a hallway filled with doors of all sizes. On a glass table, she found a small golden key and a bottle labeled “Drink Me.” She sipped the potion and began to shrink until she was just the right size to fit through a tiny door that led to a beautiful garden.\n" +
                        "As Alice explored Wonderland, she met many strange characters. First, she encountered a talking Caterpillar sitting on a mushroom. He gave her confusing advice and told her that the mushroom could change her size. Alice took a piece of the mushroom and continued on her journey.\n" +
                        "\n" +
                        "Next, she met the Cheshire Cat, a grinning cat who could appear and disappear whenever he wanted. The Cheshire Cat told Alice to go to the March Hare’s house, where she found the Mad Hatter and the Dormouse having a never-ending tea party. The Mad Hatter and the March Hare were quite silly indeed, constantly switching seats and talking in riddles. Alice found their actions amusing but also a bit frustrating.\n" +
                        "After leaving the tea party, Alice wandered into the garden of the Queen of Hearts. The Queen was a bossy ruler who loved to play croquet with flamingos as hammers and hedgehogs as balls. The Queen was quick to anger, frequently shouting, “Off with their heads!” whenever she was displeased. Despite the Queen’s scary demeanor, Alice bravely stood up to her.\n" +
                        "During the game, Alice met the King of Hearts and the royal court, including a variety of living playing cards. The Queen said that the Knave of Hearts had stolen her tarts, and a meeting was held to decide if he was guilty. The court events were silly and chaotic, with witnesses like the Mad Hatter and the March Hare giving stories that didn’t make sense.\n" +
                        "As the trial grew more ridiculous, Alice found herself growing larger and larger. The Queen demanded her execution, but Alice, now towering over everyone, simply declared, “You’re nothing but a pack of cards!” At that moment, the entire court rose into the air and came tumbling down upon her.\n" +
                        "Suddenly, Alice woke up on the riverbank, back in the real world. She realized that her adventures in Wonderland had been a dream. She looked around and saw her sister still reading a book nearby.Alice smiled and thought about all the curious and wonderful characters she had met in her dream. Though it had all been an amazing and unreal adventure, Alice knew she would always remember her journey through Wonderland and the lessons she learned about curiosity, bravery, and standing up for herself.\n" +
                        "The end.",
                "Once upon a time, in the heart of a vast savanna glowing in golden sunlight, lived a little lion cub named Simba. Simba wasn’t just any cub; he was a prince, destined to be king one day.His father, Mufasa, the mighty lion with a mane like a crown, ruled the land with wisdom and kindness. He taught Simba all about the Circle of Life, a beautiful way of explaining how everything in the world was connected. Just like the sun sets to make way for the moon and the grass feeds the zebras, everything had its place and purpose.\n" +
                        "Simba’s best friend was Nala, a playful little lioness with fur as golden as the setting sun. Together, they explored the savanna, chased butterflies, and pounced on imaginary enemies. They were inseparable, two little adventurers with the whole world ahead of them.\n" +
                        "One day, Simba’s sneaky uncle, Scar, a cunning lion with a dark mane, decided he wanted to be king instead of Simba. He tricked Simba and his father into a dangerous stampede of wildebeests. Mufasa, trying to save Simba, got caught in the rushing herd and was tragically lost.Simba was very sad and scared. He ran away from the Pride Lands, his home, feeling alone. He stumbled into a lush jungle, far away from everything he knew. There, he was found by Timon and Pumbaa, a meerkat and a warthog who lived by the motto “Hakuna Matata” – no worries!\n" +
                        "Timon and Pumbaa, though different from Simba, cared for him like family. They taught him to forget his past and enjoy the carefree life in the jungle. Simba grew bigger and stronger, forgetting his royal lineage and the responsibility that came with it.\n" +
                        "Years passed, and Simba became a handsome young lion. One day, while chasing a clever bug named Rafiki, the wise mandrill who served as the royal advisor, Simba bumped into Nala, now a beautiful lioness. Nala, surprised to see Simba, was happy but also worried.\n" +
                        "She saw that Simba had forgotten his past and the troubles the Pride Lands faced. Scar, the mean uncle, had become king and turned the once flourishing land into a barren wasteland. Scar’s time as king was marked by laziness, selfishness, and not caring about the Circle of Life.\n" +
                        "Nala begged Simba to come back and be the true king. Simba, unsure at first, remembered the things his father taught him and the pride he felt being Mufasa’s son. He realized he couldn’t ignore his responsibility and let Scar keep ruining the Pride Lands.With new courage and Nala by his side, Simba journeyed back home. He met with Rafiki, who reminded him of who he truly was – a future king. Rafiki also showed Simba his reflection in the water, where he saw his father’s eyes staring back.\n" +
                        "Simba understood. He was Mufasa’s son, and the future king. He couldn’t let fear stop him anymore. He had to fight for what was right, not just for himself, but for the whole Pride Lands.\n" +
                        "Simba returned with a roar, challenging Scar for the kingship. A big fight happened, Simba remembering his training and fighting with the courage of a true king. Scar, weakened by years of laziness, was eventually defeated.\n" +
                        "With Scar gone, Simba climbed up Pride Rock, the symbol of royalty. He looked over the land, once barren but now hopeful for a better future. Nala stood beside him, and together, they began to fix the damage Scar had caused.\n" +
                        "Simba, remembering the Circle of Life, knew everyone had a role to play. He restored the balance in the Pride Lands, allowing the animals to live in peace and harmony. Simba became a wise and fair king, just like his father.And so, the little lion cub who once ran away, scared and alone, returned as a strong and responsible leader. He had learned that facing your fears, honoring your family, and understanding the Circle of Life were the true marks of a king.\n" +
                        "The End!",
                "Once upon a time, in a snowy town on Christmas Eve, there lived a little girl named Evelyn. She was known as the Little Match Girl because she sold matches to help her family make ends meet. Despite the cold and poverty, Evelyn had a warm heart and a vivid imagination.As the evening approached, the town lit up with festive lights, and the laughter of families filled the air. Evelyn wandered the streets, clutching her box of matches tightly to her chest, hoping to sell enough to bring home some money for her family.\n" +
                        "But the townspeople were too busy with their own celebrations to notice the little girl. No one stopped to buy her matches, and she grew colder and more disheartened with each passing moment.\n" +
                        "Feeling exhausted and defeated, Evelyn found a secluded alleyway to sit down for a moment. As she huddled against the cold wall, she took out a single match and struck it against the wall to keep warm. To her surprise, a small, warm glow emanated from the match, casting a soft light around her.In the flickering light of the match, Evelyn’s imagination came to life. She saw visions of happy families sitting around a grand feast, children unwrapping presents, and laughter filling the air. It was a magical world she had only dreamed of.\n" +
                        "But as quickly as the match ignited, it extinguished, and the visions disappeared. Evelyn felt a sense of longing and sadness, but she struck another match to bring back the warmth and the magical visions.\n" +
                        "With each match she lit, Evelyn was transported to a different scene—a cozy hearth with crackling flames, a bustling marketplace with cheerful vendors, and a magnificent Christmas tree adorned with twinkling lights.\n" +
                        "But as the matches burned out, so did the illusions. Evelyn realized that she couldn’t stay in the warmth of her imagination forever; she had to face the reality of her situation.\n" +
                        "As Evelyn strikes her last match, instead of fading into the cold, she sees a vision of her grandmother. But this time, the vision doesn’t disappear. Her grandmother’s warm smile grows brighter, and suddenly, the coldness around Evelyn starts to melt away.Evelyn didn’t know that one of the townspeople had seen her sitting in the alley. A kind woman, with a soft heart, noticed the little girl sitting alone and had hurried to bring her food and a warm blanket. As Evelyn’s match glows its brightest, the woman reaches her, wrapping her in the warmth of the blanket just as the final match flickers out.\n" +
                        "Evelyn opens her eyes to find herself in the woman’s arms. She’s no longer alone. The woman, seeing Evelyn’s need, decides to take her home, offering her food, warmth, and a place to stay.\n" +
                        "Soon, the word spreads through the town about the Little Match Girl’s misfortune, and the people who had ignored her before come together. They donate food, clothes, and money to help her family, ensuring they no longer have to suffer through the harsh winter. The community realizes that they need to take better care of each other, especially during Christmas, when kindness and compassion are most important.\n" +
                        "Evelyn’s family is overjoyed, and her mother hugs her tightly, grateful for the kindness of the townspeople. Evelyn, no longer cold or hungry, finds warmth in her new home. And though she had always dreamed of a magical world, she discovers that magic can come in the form of human kindness and love.\n" +
                        "From then on, the people of the town made sure to never let anyone suffer alone again, and every Christmas Eve, they remembered how the Little Match Girl brought the town together.The end!",
                "One day emperor Akbar decides to give alms to all the visually challenged people in the kingdom. He orders his courtiers to make a list of all such people. The courtiers make the list ready and share it with the emperor.\n" +
                        "Akbar takes a look at the list and says, “Very well. Take this list to Birbal. Make sure that these people get good alms tomorrow at the bazaar.”\n" +
                        "Birbal looks at the list, goes to Akbar and remarks, “Your Majesty, this list is incomplete.”\"What do you mean incomplete?” exclaims Akbar.\n" +
                        "“Your Majesty, the list must be longer as we missed several such people. Give me a day’s time and I will prove it,” says Birbal.\n" +
                        "Akbar agrees. The next day, Birbal takes a frame of an old cot, sits at the crossroads of the bazaar, and begins weaving the cot with a string. A servant stands next to Birbal with a pen and a scroll.\n" +
                        "A courtier passing by the bazaar sees Birbal and asks, “Hey Birbal! What on earth are you doing?” Birbal does not reply but mumbles to his servant, who then scribbles something on the scroll.Soon, a crowd gathers around Birbal. Each time someone enquires Birbal, he mumbles to his servant, who then writes on the scroll. The news of Birbal’s antics reaches the court and Akbar arrives at the bazaar.\n" +
                        "“What are you doing Birbal??” he asks.\n" +
                        "Without replying, Birbal continues to weave the cot, takes the scroll from the servant’s hand, and hands it over to Akbar.\n" +
                        "“Here is the list of blinds, Your Majesty.”\n" +
                        "Akbar looks at it and is shocked to see his name at the very end of the list.\n" +
                        "“What nonsense is this?! Why is my name on the list?” the irked emperor asks.\"Jahanpanah, you and all the others in the list asked me what I was doing despite it being evident that I was weaving my cot. So, don’t you all deserve a place on the list?”\n" +
                        "Akbar understands his folly and bursts into laughter. “Well done Birbal. You just opened my eyes by proving me blind!” says the amused Akbar.\n" +
                        "The takeaway: Keep your eyes and mind open to gain clarity about a situation. The end!",
                "One day, Akbar and Birbal went for a walk near the lake on a chilly winter day. The idea that a man would do anything for money crossed Birbal's mind. He told Akbar what he was thinking. Akbar then dipped his finger into the lake but pulled it out as soon as he began to shake.\n" +
                        "\n" +
                        "“I don't suppose a man would spend a whole night in the chilly lake water for money,” Akbar replied. “I'm sure I can find someone like that,” Birbal responded. Akbar immediately issued a challenge to Birbal to track down such a person, promising to reward the successful hunter with a sum of a thousand gold coins.\n" +
                        "\n" +
                        "Birbal looked everywhere until he discovered a beggar willing to take the task. The poor man entered the lake, and Akbar stationed guards nearby to see that he actually followed through on his vow.\n" +
                        "\n" +
                        "The guards brought the wretched man to Akbar the following morning. Akbar questioned him to verify if the man had truly spent the night in the lake. The unlucky man confessed that he had. Then Akbar enquired the man how he had spent the night in the water. The poor man responded that there was a street lamp nearby, and he continued to focus on the lamp and not the cold. As the man had survived the night in the lake, thanks to the warmth of the street lamp, Akbar declared that there would be no reward. The struggling man then asked Birbal.\n" +
                        "\n" +
                        "Birbal skipped court the next morning. Sending a messenger to his residence, the king inquired about his whereabouts.\n" +
                        "\n" +
                        "As soon as Birbal's Khichdi was prepared, the messenger reported, he would arrive. Birbal did not show up despite the king's long waiting. The king finally made up his mind to visit Birbal's home and find out what he was doing. He discovered Birbal was seated on the ground near some flaming branches and a bowl of Khichdi hanging five feet above the flames. The monarch and his servants could not control their laughter.\n" +
                        "\n" +
                        "\"How can the Khichdi be cooked if it is that far away from the fire,\" Akbar asked Birbal.\n" +
                        "“The poor fellow got heat from a street bulb that was more than the farthest distance,” Birbal replied.\n" +
                        "Akbar realized what Birbal was implying, and the poor man received his award once the King realized his error. The end!",
                "Once upon a time in ancient Greece, there lived a king named Midas. He had a lovely daughter whom he lovingly named Marigold. Although King Midas had immense wealth in his kingdom’s treasury, he was always dissatisfied and unhappy. He was always greedy for more wealth and wished he had more gold in his treasure.\n" +
                        "One day as he was counting gold coins and admiring his treasure rooms, a wise Greek God appeared before him who offered the king a wish for some of his good deeds. Without wasting any time, King Midas quickly wished that everything that he touched should turn into gold. The Greek God granted his wish promptly and disappeared.\n" +
                        "King Midas was delighted about his wish being granted, he went and touched an apple tree in his garden. To his excitement, the tree turned into gold instantly. He was so thrilled that he went on touching random things all around him, which turned into gold immediately. His joy knew no bounds and he was overwhelmed with excitement. Soon he was hungry and he returned to his palace to eat some food. However, though he was starving, he was disappointed that he could not eat anything as whatever he touched turned into gold instantly.\n" +
                        "Seeing him frustrated and troubled, Marigold came running and threw her arms around her father to comfort him. But to his dismay, even his daughter turned into gold as he touched her. King Midas’ face turned pale and his heart sank with unbearable pain and grief. He was horrified upon seeing his daughter turn into a golden statue. He cried in anguish and regretted his wish for the golden touch. In no time, he realised his greed was his biggest ever flaw and begged the Greek God to take back his wish.\n" +
                        "Soon the Greek God appeared before him and felt pity for his condition and took back the golden touch wish from him. Further, the wise God instructed King Midas to take a dip in the pond of his palace and sprinkle that water to all those things which he wanted to change back to the previous condition. He blindly followed the instructions and soon his daughter, Marigold was back to normal when he sprinkled the water on her. Thereafter, he was elated to get back his beloved daughter and promised to stop being greedy henceforth. The end!",
                "One hot summer day on a farm, a mother duck sat on her nest and wondered when her eggs would hatch. One fine day, the eggs started cracking and hatching and tiny little ducklings started coming out of the shells one after another. The tiny ducklings flapped their wings and cried “Quack, quack!” The mother duck was happy to see all her ducklings, except for the last one which emerged as a strange-looking duckling with grey feathers.\n" +
                        "Mother duck called out to all her ducklings for their first swim in the pond. She led all her children to the nearby pond and began teaching each duckling how to become a proper duck. All the ducklings quacked in joy, except for the one with grey feathers which made a crackling sound. The other ducklings stared at him and began to laugh. The ugly one hung his head in shame.\n" +
                        "In due course of time, the mother duck and her ducklings started ignoring him while the others practised quacking, swimming, diving and splashing water in the pond. Feeling dejected and unwanted, finally one evening the ugly duckling decided to leave his home in winter and ran away to live in a swamp all by himself.\n" +
                        "On his way, the ugly duckling stumbled across a farmer who took pity on him and offered him food and shelter. However, the duckling was terrified of the farmer’s mischievous children, so he escaped the place.\n" +
                        "At last, as spring arrived the duckling was happy that he could start swimming again in the lake. He went to the nearby lake where he found a flock of beautiful swans swimming and gazed at their beauty. As the duckling had fully grown now and he approached the swans if he could join them, completely assured of rejection. To his surprise, the swans welcomed him warmly.\n" +
                        "While getting into the lake, he saw his reflection in the water and was surprised to see that he is not an ugly duckling anymore. He had transformed into a beautiful swan. Soon he joined the flock of beautiful swans and was happy to fly off with his newly found swan family. The end!",
                "Once upon a time, in a cozy little house at the edge of a friendly forest, there lived a soft and cuddly teddy bear named Teddy. Teddy belonged to a sweet girl named Mia, who loved him dearly. Every night, Mia would snuggle with Teddy and tell him about her day before falling asleep. One special night, as Mia drifted off to sleep, something incredible happened. Teddy began to glow with a soft, warm light. His eyes twinkled, and his little paws tingled with magic. Suddenly, Teddy found himself standing in the middle of a magical forest filled with shimmering trees and sparkling flowers.\n" +
                        "\n" +
                        "“Wow!” Teddy exclaimed, looking around in amazement. “This place is incredible!”\n" +
                        "\n" +
                        "Just then, a friendly fairy named Luna fluttered down from a glowing tree. “Hello, Teddy! Welcome to the Enchanted Forest. I’m Luna, and I’m here to guide you on a magical adventure!” n a magical adventure!”\n" +
                        "\n" +
                        "Teddy’s heart filled with excitement. “An adventure? That sounds wonderful! What do we need to do?”\n" +
                        "\n" +
                        "Luna smiled. “We need to find three magical treasures hidden in the forest. Each treasure will help protect the forest and keep its magic alive. Are you ready?”\n" +
                        "\n" +
                        "Teddy nodded eagerly. “I’m ready!”\n" +
                        "\n" +
                        "Luna led Teddy to the first part of the forest, where they found a sparkling stream. Beside the stream was a shiny, golden key resting on a rock. “This is the Key of Kindness,” Luna explained. “It unlocks the hearts of those who are sad and helps them find happiness.”\n" +
                        "\n" +
                        "Teddy carefully picked up the key, feeling its warmth. “This is a very special key,” he said. Next, Luna and Teddy ventured deeper into the forest, where they found a beautiful, glowing flower. The flower’s petals were a vibrant rainbow of colors. “This is the Flower of Friendship,” Luna said. “Its petals have the power to bring people together and create lasting friendships.”\n" +
                        "\n" +
                        "Teddy gently picked the flower and placed it in his little backpack. “Friendship is so important,” he said, smiling.\n" +
                        "\n" +
                        "Finally, Luna and Teddy reached a hidden glade filled with twinkling stars. In the center of the glade was a crystal ball that shone like the moon. “This is the Crystal of Courage,” Luna said. “It gives strength and bravery to those who need it most.”\n" +
                        "\n" +
                        "Teddy picked up the crystal, feeling its strong, comforting energy. “With this, I can help others be brave,” he said.\n" +
                        "\n" +
                        "As Teddy held all three treasures, the forest began to glow even brighter. The trees, flowers, and animals all sparkled with magic. “You’ve done it, Teddy!” Luna cheered. “You’ve found the treasures and saved the Enchanted Forest!” Teddy felt proud and happy. “Thank you for helping me, Luna. This has been the most amazing adventure.”\n" +
                        "\n" +
                        "Luna hugged Teddy tightly. “You have a kind heart, Teddy. Remember, the magic of kindness, friendship, and courage is always within you.”\n" +
                        "\n" +
                        "With a gentle wave of her wand, Luna sent Teddy back to Mia’s cozy bedroom. Teddy found himself back in Mia’s arms, his heart still glowing with the magic of the adventure.\n" +
                        "\n" +
                        "The next morning, Mia woke up and hugged Teddy tightly. “Good morning, Teddy! I had the most wonderful dream about you going on a magical adventure!”\n" +
                        "\n" +
                        "Teddy smiled, knowing that his magical adventure was real and that the magic of kindness, friendship, and courage would always be with him and Mia. And from that day on, Teddy and Mia shared many more adventures, spreading magic and happiness wherever they went.\n" +
                        "\n" +
                        "The end.",
                "Once upon a time, in a cozy little cottage, there lived an old woman and an old man. One day, the old woman decided to bake a special treat. “I’m going to make a gingerbread man!” she exclaimed. She mixed the dough, rolled it out, and cut it into the shape of a little man. She gave him raisins for eyes, a cherry for a nose, and a row of buttons made from bits of candy. Then she put him in the oven to bake.\n" +
                        "\n" +
                        "Soon, the kitchen was filled with the delicious smell of gingerbread. The old woman opened the oven door, and to her surprise, the gingerbread man jumped out and ran straight out of the cottage door!\n" +
                        "\n" +
                        "The old woman and the old man chased after him, shouting, “Stop! Stop! We want to eat you!” But the gingerbread man just laughed and called back, “Run, run, as fast as you can! You can’t catch me, I’m the Gingerbread Man!” The Gingerbread Man ran through the garden and past a cow. The cow mooed, “Stop! Stop! I want to eat you!” But the Gingerbread Man just laughed and called out, “I’ve run away from an old woman and an old man, and I can run away from you, I can!”\n" +
                        "\n" +
                        "He ran even faster, with the cow joining the chase. Soon, he passed a horse in the field. The horse neighed, “Stop! Stop! I want to eat you!” But the Gingerbread Man just laughed and called out, “I’ve run away from an old woman, an old man, and a cow, and I can run away from you, I can!”\n" +
                        "\n" +
                        "The Gingerbread Man ran on, with the old woman, the old man, the cow, and the horse all chasing after him. He passed a hen pecking at the ground. The hen clucked, “Stop! Stop! I want to eat you!” But the Gingerbread Man just laughed and called out, “I’ve run away from an old woman, an old man, a cow, and a horse, and I can run away from you, I can!”\n" +
                        "\n" +
                        "The Gingerbread Man was very pleased with himself. “They’ll never catch me!” he thought. But as he ran along the riverbank, he met a sneaky fox. The fox licked his lips and said, “Hello there, little Gingerbread Man. Why are you in such a hurry?”\n" +
                        "\n" +
                        "The Gingerbread Man replied, “I’ve run away from an old woman, an old man, a cow, a horse, and a hen, and I can run away from you, I can!” The fox with sneaky smile said, “Oh, I’m not interested in chasing you. But if you need to cross the river, I can help. Jump on my tail, and I’ll carry you across.”\n" +
                        "\n" +
                        "The Gingerbread Man thought it over and decided to trust the fox. He jumped onto the fox’s tail, and the fox began to swim across the river. As they went deeper into the water, the fox said, “You’d better move to my back, so you don’t get wet.”\n" +
                        "\n" +
                        "The Gingerbread Man did as he was told. But soon, the water got even deeper. “You’d better move to my head,” said the fox, and the Gingerbread Man moved to the fox’s head.\n" +
                        "\n" +
                        "Finally, as the water reached its deepest point, the fox said, “You’d better move to my nose, so you don’t get wet.” The Gingerbread Man carefully moved to the fox’s nose.\n" +
                        "\n" +
                        "But just as they reached the other side of the river, the fox tossed the Gingerbread Man into the air, opened his mouth, and snap! The Gingerbread Man was gone. And that was the end of the Gingerbread Man. The old woman and the old man went home, and from then on, they were more careful about their baking. But they always remembered the Gingerbread Man and his adventurous, if short-lived, escape.\n" +
                        "\n" +
                        "The end.",
                "Once upon a time, in a faraway kingdom, there lived a young girl named Cinderella. She was a kind, gentle, and beautiful child with the most radiant smile. Cinderella had a heart full of love, but unfortunately, fate hadn’t been kind to Cinderella. Her mother had passed away, leaving her alone with her selfish stepmother. The stepmother had two daughters of her own, and she was terribly jealous of Cinderella’s beauty and kind heart. She treated Cinderella unfairly, making her do all the housework and dress in rags while her own daughters wore fine clothes and lived in luxury.\n" +
                        "\n" +
                        "Despite the cruelty she faced, Cinderella remained kind and gentle, never letting her stepmother’s unkindness change who she was. She would often seek comfort in the garden, talking to the birds and the animals, who had become her dearest friends.\n" +
                        "\n" +
                        "One day, the kingdom received exciting news. The prince was hosting a grand ball at the palace, and every maiden in the land was invited. Cinderella’s stepsisters were overjoyed and spent weeks preparing their gowns and practicing their dance moves. Cinderella watched her stepsisters with a sad smile, hoping she might be able to attend the ball and experience a bit of the magic she had heard about in her mother’s stories. But her stepmother was insistent that Cinderella would stay home and continue with her chores.\n" +
                        "\n" +
                        "The night of the ball arrived, and Cinderella was left alone in her old clothes while her stepsisters and stepmother departed for the palace. She sat by the fireplace, tears in her eyes, wishing for just a taste of the magic her mother had told her about.\n" +
                        "\n" +
                        "Suddenly, a soft, sweet voice filled the room. It was her fairy godmother, a beautiful figure surrounded by a soft, glowing light.\n" +
                        "\n" +
                        "“Why are you crying, my dear?” the fairy godmother asked.\n" +
                        "\n" +
                        "Cinderella explained her wish to attend the ball but how her stepmother had been unkind and refused to allow her to go. The fairy godmother smiled and said, “Don’t worry, my child. You shall go to the ball.”\n" +
                        "\n" +
                        "With a wave of her wand, Cinderella’s rags were transformed into a stunning gown, and on her feet, she wore the most delicate glass slippers that sparkled like stars. Her fairy godmother turned a pumpkin into a magnificent carriage and mice into beautiful horses, so Cinderella could travel to the palace in style.\n" +
                        "\n" +
                        "Before she left, the fairy godmother gave Cinderella a piece of advice: “Remember, my dear, the magic will only last until midnight. When the clock strikes twelve, you must leave the palace and return home.”\n" +
                        "\n" +
                        "Cinderella thanked her fairy godmother and climbed into the magical carriage. As she arrived at the palace, she felt like a princess, her heart dancing with joy.\n" +
                        "\n" +
                        "The moment Cinderella entered the ballroom, the entire room fell silent. The prince, charmed by her beauty, approached her, and they danced together like a dream. Cinderella was the happiest she had ever been. But as the hours flew by, she suddenly heard the bells of the palace clock. The first stroke of midnight sent a shiver down her spine. She remembered her fairy godmother’s warning and knew she must leave.\n" +
                        "\n" +
                        "Cinderella hurriedly said goodbye to the prince and fled from the palace. As she ran down the grand staircase, one of her glass slippers slipped off her foot. She didn’t have time to retrieve it, and so, with only one glass slipper, she disappeared into the night.\n" +
                        "\n" +
                        "Cinderella’s beautiful gown and glass slippers turned back into rags, leaving her with only the memory of the enchanting evening she had spent at the palace.\n" +
                        "\n" +
                        "The next day, the prince was determined to find the owner of the glass slipper. He and his attendants traveled throughout the kingdom, visiting every home to see if the slipper would fit any young maiden.\n" +
                        "\n" +
                        "When they arrived at Cinderella’s cottage, her stepsisters eagerly tried to fit their feet into the glass slipper. But it was too small for them, and their feet simply couldn’t squeeze in.\n" +
                        "\n Cinderella watched, hidden from view, as her stepsisters attempted to trick the prince. Then, she stepped forward and, with a hopeful heart, asked, “May I try?”\n" +
                        "\n" +
                        "The prince agreed, and as she placed her foot into the glass slipper, it fit perfectly. The prince’s eyes lit up with joy as he realized he had found the maiden he had danced with at the ball.\n" +
                        "\n" +
                        "Cinderella’s stepsisters were astonished and upset. But even though they were mean to her, Cinderella didn’t feel angry. Instead, she forgave them for their unkindness, as she believed that kindness was the most important thing in the world.\n" +
                        "\n" +
                        "And so, Cinderella was reunited with the prince, and they lived happily ever after, proving that goodness, kindness, and a loving heart could overcome the challenges life may bring.\n" +
                        "\n" +
                        "The end!",
                "Once upon a time, in a cozy little cottage deep in the woods, lived a family of bears. Papa Bear, Mama Bear, and Baby Bear were a happy trio, spending their days exploring the forest and enjoying each other’s company. One sunny morning, while the bears were out for a walk, a curious little girl named Goldilocks wandered into their cottage. She had been exploring the woods and was feeling a bit tired and hungry.\n" +
                        "\n" +
                        "Goldilocks noticed the open door and couldn’t resist peeking inside. The sight of three steaming bowls of porridge on the table caught her attention. She decided to take a closer look.\n" +
                        "\n" +
                        "The first bowl she tasted belonged to Papa Bear, but it was too hot. The second bowl, which belonged to Mama Bear, was too cold. Finally, Goldilocks tried Baby Bear’s bowl and found it to be just right. She happily ate it all up. After her delicious meal, Goldilocks spotted three chairs by the fireplace. She sat in Papa Bear’s chair, but it was too big. Mama Bear’s chair was too soft, but Baby Bear’s chair was just right. Goldilocks wiggled and waggled until she accidentally broke Baby Bear’s chair.\n" +
                        "\n" +
                        "Feeling a bit tired, Goldilocks climbed the stairs and found three beds in the bedroom. She tried Papa Bear’s bed, but it was too hard. Mama Bear’s bed was too soft, but Baby Bear’s bed was just right. She snuggled in and soon fell asleep.\n" +
                        "\n" +
                        "Meanwhile, the three bears returned home, surprised to find their cottage in a mess. Mama Bear noticed the porridge bowls, Papa Bear saw the chairs, and Baby Bear noticed his broken chair.\n" +
                        "\n" +
                        "“Someone’s been here,” Mama Bear said.\n" +
                        "\n" +
                        "“And they’ve been eating our porridge,” added Papa Bear. “Look at my chair! It’s broken!” cried Baby Bear.\n" +
                        "\n" +
                        "Just then, they heard a soft snore coming from upstairs. The bears followed the sound and found Goldilocks sleeping peacefully in Baby Bear’s bed.\n" +
                        "\n" +
                        "“Wake up, little girl,” said Mama Bear gently.\n" +
                        "\n" +
                        "Goldilocks woke up with a start, seeing the bears standing before her. She felt a bit scared but quickly realized that they were not angry.\n" +
                        "\n" +
                        "“I’m sorry for coming into your home and trying your things,” Goldilocks said, tears in her eyes. “I didn’t mean to break Baby Bear’s chair.” The bears saw how sincere she was and smiled kindly.\n" +
                        "\n" +
                        "“It’s alright,” said Papa Bear. “We’re glad you’re okay. But remember, it’s important to respect others’ belongings and homes.”\n" +
                        "\n" +
                        "Goldilocks nodded, feeling relieved. The bears offered her some freshly made porridge, and they all sat together at the table.\n" +
                        "\n" +
                        "From that day on, Goldilocks and the three bears became good friends. Goldilocks learned the importance of asking for permission and treating others’ belongings with care. The end!",
                "Once upon a time, in a cozy nursery, there was a little Velveteen Rabbit. He was a gift to a young boy who loved him dearly. The boy played with the rabbit every day, and the two became the best of friends. As time passed, the little boy’s toy collection grew, and the Velveteen Rabbit often felt forgotten among the newer, shinier toys. But deep down, the rabbit knew that being loved by the boy made him real, even if he was not as fancy as the others.\n" +
                        "\n" +
                        "One day, the boy fell ill and had to stay in bed. His mother took care of him, but she noticed how much he missed playing with his toys. She decided to bring the Velveteen Rabbit to the boy’s side, hoping to comfort him.\n" +
                        "\n" +
                        "The rabbit hopped into the boy’s bed and snuggled close to him. The boy smiled and held the rabbit tight, feeling the softness of his velveteen fur. As they spent time together, the boy’s love for the rabbit grew stronger than ever. One night, when the stars were shining brightly, a magical fairy appeared before the Velveteen Rabbit. The fairy smiled warmly and said, “You have become real because of the love the boy has for you. Your heart is filled with joy and kindness, and that is what makes you special.”\n" +
                        "\n" +
                        "The Velveteen Rabbit was overjoyed to hear these words. He had always wanted to be real, and now his wish had come true. The fairy gently touched his nose, and a soft, warm light enveloped the rabbit.\n" +
                        "\n" +
                        "The next morning, when the boy woke up, he saw that the Velveteen Rabbit had transformed. He was no longer just a toy but a real, living rabbit with velveteen fur and twinkling eyes. The boy was amazed and delighted to see his beloved friend come to life.\n" +
                        "\n" +
                        "From that day on, the boy and the Velveteen Rabbit were inseparable. They shared many adventures together, and the boy loved his furry friend even more. The Velveteen Rabbit knew that he would always be loved and cherished, and that was the most magical thing of all.\n" +
                        "\n" +
                        "And so, the Velveteen Rabbit’s journey from a simple toy to a cherished, real friend taught us that love is the most powerful magic of all. The end!",
                "Once upon a time, in a faraway kingdom, there was a kind and beautiful princess named Snow White. She had skin as white as snow, lips as red as roses, and hair as black as coal. But her life was not easy. She lived with her stepmother, the Queen, who was beautiful on the outside but cruel and jealous on the inside. This woman, the Evil Queen, was obsessed with being the most beautiful in the kingdom. The Evil Queen had a magical mirror that she consulted every day. She would ask, “Mirror, mirror on the wall, who is the fairest of them all?” And the mirror would always reply, “You, my Queen, are the fairest of them all.” This made the Queen very happy, for she wanted to be admired by everyone. However, as Snow White grew older, her beauty became even greater, and one day, when the Queen asked her question, the mirror gave a different answer. “Snow White is the fairest of them all.”\n" +
                        "\n" +
                        "The Queen was furious. She could not bear the thought of anyone being more beautiful than her. Filled with anger and jealousy, she devised a wicked plan. She summoned the royal huntsman and ordered him to take Snow White deep into the forest and get rid of her. The huntsman took Snow White into the woods, but when he saw her innocent face and kind eyes, he could not bring himself to harm her. “Run far away and never return to the castle,” he whispered. “The Queen must never find you.”\n" +
                        "\n" +
                        "Snow White ran as fast as she could, her heart pounding in fear. The dark forest seemed endless, and strange shadows surrounded her. She stumbled over roots and bushes, feeling lost and alone. After wandering for hours, she came across a tiny cottage hidden among the trees. She knocked on the door, but no one answered. Slowly, she pushed it open and stepped inside. The cottage was small but cozy, with seven tiny chairs, seven tiny beds, and seven tiny plates on the table. Exhausted, she lay down across the small beds and fell into a deep sleep. Later that evening, the owners of the cottage returned home. They were seven dwarfs who worked in the nearby mines, digging for precious stones. When they found Snow White asleep in their beds, they were very surprised. “Who is this girl?” they whispered to each other.\n" +
                        "\n" +
                        "Snow White woke up and saw the kind faces of the dwarfs. She quickly explained her story, and the dwarfs felt sorry for her. “You can stay here with us,” they said, “but you must be careful! The Queen will try to find you.” Snow White gratefully agreed and promised to help them with cooking and cleaning while they were at work.\n" +
                        "\n" +
                        "Back at the castle, the Evil Queen once again asked her mirror, “Mirror, mirror on the wall, who is the fairest of them all?” To her horror, the mirror replied, “Snow White, who lives with the seven dwarfs, is the fairest of them all.”\n" +
                        "\n" +
                        "The Queen’s jealousy burned stronger than ever. She decided to take matters into her own hands. Using dark magic, she disguised herself as an old woman and prepared a poisoned apple. Then, she traveled to the dwarfs’ cottage and knocked on the door. When Snow White answered, the old woman smiled kindly and held out the shiny, red apple. “Take a bite, my dear. It is the sweetest apple you will ever taste.”\n" +
                        "\n" +
                        "Snow White hesitated but saw no harm in accepting the gift. She took a small bite, and as soon as she did, she felt dizzy. The room spun around her, and she collapsed to the ground, unconscious. The Evil Queen let out a wicked laugh and disappeared into the forest, believing she had won. That evening, when the dwarfs returned home, they found Snow White lying still and lifeless. No matter what they did, she did not wake up. Heartbroken, they built a glass coffin for her and placed her in the middle of the forest. They took turns keeping watch, hoping she would wake up one day. The animals of the forest also gathered around, mourning the kind princess.\n" +
                        "\n" +
                        "Time passed, and one day, a prince who had heard of Snow White’s beauty came riding through the forest. When he saw her lying in the glass coffin, he was struck by her beauty and sadness filled his heart. He had never met her before, but he felt as if he had known her forever. Overcome with emotion, he leaned down and gently kissed her forehead.\n" +
                        "\n" +
                        "As if by magic, Snow White’s eyes fluttered open! The spell was broken by true love’s kiss. The dwarfs cheered with joy, and the prince was overjoyed. “Come with me to my castle,” he said. “I will keep you safe forever.”\n" +
                        "\n" +
                        "Snow White smiled and nodded. She bid a tearful farewell to the dwarfs, promising never to forget them. They waved as she rode away with the prince, ready to begin a new and happy life. Meanwhile, when the Evil Queen learned that Snow White was alive, her rage was so strong that it destroyed her own magic. She lost her powers and vanished forever, never to harm anyone again.\n" +
                        "\n" +
                        "Snow White and the prince lived happily ever after in his grand castle, but she never forgot the kindness of the seven dwarfs who had saved her. She often visited them, bringing gifts and laughter to their little cottage in the woods. And from that day on, she never had to live in fear again. The End!"
        };

        int[] storyImages = new int[]{
                com.example.wondersoftales.R.drawable.photo1,
                com.example.wondersoftales.R.drawable.photo2,
                com.example.wondersoftales.R.drawable.photo3,
                com.example.wondersoftales.R.drawable.photo4,
                com.example.wondersoftales.R.drawable.photo5,
                com.example.wondersoftales.R.drawable.photo6,
                com.example.wondersoftales.R.drawable.photo7,
                com.example.wondersoftales.R.drawable.photo8,
                com.example.wondersoftales.R.drawable.photo9,
                com.example.wondersoftales.R.drawable.photo10,
                com.example.wondersoftales.R.drawable.photo11,
                com.example.wondersoftales.R.drawable.photo12,
                com.example.wondersoftales.R.drawable.photo13,
                com.example.wondersoftales.R.drawable.photo14,
                com.example.wondersoftales.R.drawable.photo15

        };

        int[] storyAudio = new int[]{
                R.raw.littleredriddinghood,
                R.raw.theraven,
                R.raw.aliceinthewonderland,
                R.raw.lionking,
                R.raw.littlematchgirl,
                R.raw.listofblinds,
                R.raw.birbalkhichdi,
                R.raw.kingmidas,
                R.raw.uglyduckling,
                R.raw.teddy,
                R.raw.gingerbreadman,
                R.raw.cinderella,
                R.raw.goldilocks,
                R.raw.rabbit,
                R.raw.snowwite
        };


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, stories);
        listView.setAdapter(adapter);

        // Handle click event to show full story
        listView.setOnItemClickListener((AdapterView<?> parent, android.view.View view, int position, long id) -> {
            Intent intent = new Intent(SecondActivity.this, StoryDetailActivity.class);
            intent.putExtra("title", stories[position]);
            intent.putExtra("content", fullStories[position]);
            intent.putExtra("imageResId", storyImages[position]);
            intent.putExtra("audioResId", storyAudio[position]);
            startActivity(intent);
        });

        setContentView(listView);
    }
}
