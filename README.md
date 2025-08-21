# ⚔️ Epic Hero Battle: Arena Challenge - World of Warcraft Edition

## 🧙‍♂️ Description
Step into a world of **magic, strength, and strategy**, where Azeroth's most powerful heroes face off in **epic battles**.

Will you guide your **Druid**, **Archmage**, **Orc Warrior**, or **Paladin** to victory in the arena?

Prepare your characters, forge their destiny by selecting their **attributes and abilities**, and face fearsome opponents in the battle for glory. Each fight makes your hero stronger — but also tests their limits. Win battles, improve stats, and prove who’s the strongest in this Arena Challenge.

**Create, fight, and triumph** in a world where only the best survive. Do you have what it takes to become the **Champion of Azeroth**?

---

## 🧝‍♀️ Character Implementation

### 1. **Druid**
- **Name**
- **Strength**: Random value between 7 and 9
- **Agility**: Random value between 5 and 8
- **Intelligence**: Random value between 4 and 7
- **Health Points (HP)**: Random value between 70 and 90
- **Battles Won**: Initially 0
- **Battles Lost**: Initially 0
- **Battle Points**: Initially 100

### 2. **Archmage**
- **Name**
- **Intelligence**: Random value between 8 and 10
- **Arcane Resistance**: Random value between 5 and 8
- **Agility**: Random value between 4 and 7
- **Health Points (HP)**: Random value between 60 and 80
- **Battles Won**: Initially 0
- **Battles Lost**: Initially 0
- **Battle Points**: Initially 100

### 3. **Orc Warrior**
- **Name**
- **Strength**: Random value between 6 and 8
- **Defense**: Random value between 4 and 7
- **Agility**: Random value between 3 and 6
- **Health Points (HP)**: Random value between 80 and 100
- **Battles Won**: Initially 0
- **Battles Lost**: Initially 0
- **Battle Points**: Initially 100

---

## 🧾 Project Features

### 🔒 Character Serialization
- The program creates a **serializable file** to store all hero data.
- Initializes with **4 default characters** per class (names inspired by **World of Warcraft**).
- After creation, characters are saved in the serialized file.

---

## 🕹️ Program Options

### ➕ Create Character
- Loads current characters from the file.
- Allows creation of a new hero by selecting the class and generating random attributes.
- Updates the file with the new data.

### ❌ Delete Character
- Loads existing characters.
- Deletes a selected character by name.
- Saves updated data to file.

### 📜 List Characters
- Displays all characters and their attributes:
  - Name, stats, battle history, and battle points.

### 💥 SuperPower
- Adds **+100 strength and intelligence** to a selected hero.
- Costs **50 battle points**.
- Attributes are updated and saved to the file.

### ⚔️ Battle
- Select two heroes to engage in combat.
- **Combat Mechanics**:
  - Each hero uses strength, agility, intelligence, and health.
  - A random **luck factor (1–10)** influences battle outcome.
  - Attacks are calculated based on:
    - **Physical**: Strength + Agility
    - **Magical**: Intelligence
    - **Luck** modifies attacks/defenses per round.
  - The fight continues over several rounds or until a hero’s HP reaches zero.

- **Result**:
  - Winner: Gains +1 battle won and +50 battle points.
  - Loser: Gains +1 battle lost, no battle points.
  - Outcome is saved in the CSV file.

> _Optional_: The loser can recover HP in future battles, and the winner can receive minor stat boosts.

### 🚪 Exit
- Exits the program.

---

## ⚠️ Important Notes

- ⚠️ Submitting the project **without using file storage results in a grade of 0**.
- ⚠️ **Using AI tools** to solve the assignment will also result in a **0**. Only class-taught techniques are allowed.

---

## 🔍 Code Breakdown

### 🧬 `Heroe` Class
- Implements `Serializable`.
- Core attributes and methods:
  - Randomized stats using `Random()`.
  - Static methods: `fuerzaHeroe()`, `defensaHeroe()`, etc.
  - Battle tracking methods:  
    - `sumarCombatesGanados()`  
    - `sumarCombatesPerdidos()`  
    - `sumarPuntosDeBatalla()`

### 🛡️ Subclasses
- All extend `Heroe` and implement `Serializable`:
  - `Druida`, `Arquemaga`, `GuerreroOrco`

### 💾 Serialization
- `SerializarHeroe` handles reading/writing hero data using:
  ```java
  private static final String NOMBRE_ARCHIVO = "listadoHeroesx.ser";

📂 DatosHeroes Class

Stores all heroes using lists:
```
static List<Druida> druidas = new ArrayList<>();
static List<Arquemaga> arquemagas = new ArrayList<>();
static List<GuerreroOrco> guerreros = new ArrayList<>();

```
🛡️Methods:

```
numeroHeroe(int): Access hero by index.

personajeExistente(Heroe): Check if hero exists.

listarPersonajesNombre(): Print hero names.

listarPersonajes(): Print numbered list for easier selection.

eliminarPersonajes(String nombre): Delete hero by name.

superPoder(int index): Add superpower to hero.

```

🥊 Batalla Class

Handles turn-based fights:

```
int ataqueHeroe1 = (heroe1.getFuerza() + heroe1.getAgilidad() + suerte1) / 2;

Battle continues while both heroes have HP > 0.
```

Damage is calculated using:

Base stats

Luck factor (1–10)

🧠 Theory Highlights

Serialization: Convert objects to bytes to store on disk.

Deserialization: Reconstruct object from stored bytes.
# Menu interactivo  con un bucle While.


💡 References & Resources

https://es.stackoverflow.com/questions/264638/deserialize-en-java

https://es.stackoverflow.com/questions/250311

https://barcelonageeks.com/eliminar-elemento-del-indice-especificado-en-java-arraylist/

https://aprenderaprogramar.com/foros/index.php?topic=7889.0

https://aprenderaprogramar.com/foros/index.php?topic=7893.0

