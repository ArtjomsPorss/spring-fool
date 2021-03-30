a fixed collection of objects
    collection represents a single turn
each object represents an action of collection of actions
once the collection is iterated trough or exited, the turn is done, then move to other player

Important
- UI should not be able to break turn structure
    - invalid actions are dismissed
    - turns are executed on the server-side
    - ui just sends an action to server

BONUS
- turn structure and current state of the game should be able to be recreated from database data
    - how turns should be stored?
    - recreated?