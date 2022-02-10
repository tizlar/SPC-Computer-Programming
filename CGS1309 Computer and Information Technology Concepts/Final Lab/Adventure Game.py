# Adventure Game Tristan Izlar
print('You are lost underground in a maze of tunnels.')
import random
dangerTunnel = random.randint(1,2)
#print(f'Dragon is in tunnel {dangerTunnel}')
tunnelChoice = 0
while tunnelChoice < 1 or tunnelChoice > 2:
    tunnelChoice = int(input('Choose tunnel 1 or tunnel 2: '))
print('You chose tunnel ',tunnelChoice)
if tunnelChoice == dangerTunnel:
    print("As you enter the tunnel, you hear breathing powerful enough to shake the ground on which you stand. You instantly realize you've made a grave mistake"
          +". A sleeping dragon rests just past the next bend of the narrow pathway.")
    choice2 = int(input('\nWill you try your luck sneaking around the dragon, or retreat? (1 or 2): '))
    if choice2 == 1:
        print("As you carefully move around the bend, your stomach twists into a knot. There in the dark lies a rugged beast at least 15 meters long. He sits"
              +" upon a pile of what appears to be bones of other adventurers and pasture animals. You smell a rot unlike anything you've ever experienced. This"
              +" is your last chance to turn back.")
        last_chance = int(input('\nWill you press on, or fall back? (1 or 2): '))
        luck = random.randint(1,20)
        if last_chance == 1 and luck >= 15:
            print("By some act of the divine, you silently move past the dragon without any issues. You continue on the path, hoping you don't encounter anything else"
                  + " so nefarious.")  
        elif last_chance == 1 and (luck < 15 and luck > 5):
            print("""You move towards the beast, feeling the ground shake more and more the closer you get. You feel yourself sweating and your whole body"""
                  + """ shakes. Your fear is overwhelming you. You continue moving forward but your frantic state of mind has made you forget all your previous"""
                  + """ training. In this moment, you feel your foot crunch loudly on the skull of some poor creature. You know you're done. You feel its gaze"""
                  + """ burning a hole through you. You lift your head just in time to see the dragon snap its mighty jaws over your companion Aela. Aela lets out"""
                  + """ a blood curdling squeal as she is lifted and dropped hard onto the floor. Her mouth moves but no words come out. You watch helplessly,"""
                  + """ as the rest of your party are completely annihilated. You know you need to run or fight or do something, but your legs won't move. As the"""
                  + """ dragon finshes ravaging your friends, he finally turns towards you. Before you can even think about your family and life, the flames are"""
                  + """ upon you. Your bones turn to dust and your world goes dark. """ )  
            print('\nYou have lost the game.')
        elif last_chance == 2 and luck <= 5:
            print('You made a smart decision... but unfortuently you had already gotten too close to the dragon. As you turn back to go towards safety, your companion Vignar'
                  + ' stumbles over a small boulder and crashed loudly into the ground. The sound of his heavy iron armor hitting the floor echos throughout the tunnel.'
                  + ' You turn to Vignar to help him to his feet, but before you can even take a step the dragon has crushed his body from the chest down under its mighty'
                  + ' claws. Without a second thought you sprint for the exit. You hear your companions screaming as they try to defend against the unstoppable force.'
                  + " Tears run down your face, as you hear the screams stop. If you hadn't been such a coward they might have lived, or you all might have died. You live on as the sole survivor of your party, haunted by your decision forever.")

        else:
            print('You slowly back out of the tunnel. With your current gear and level of abilities, you would have never survived. Thinking about it logically, you probably only had about a 25% chance of successfully sneaking past the dragon given the terrain, and your anxiety. You made a smart decision. You and your companions leave the tunnel system forever, to fight another day.')
    else:
        print('You slowly back out of the tunnel. With your current gear and level of abilities, you would have never survived. Thinking about it logically, you probably only had about a 25% chance of successfully sneaking past the dragon given the terrain, and your anxiety. You made a smart decision. You and your companions leave the tunnel system forever, to fight another day.')
else:
    print('You entered an empty tunnel. You are safe for now.')

