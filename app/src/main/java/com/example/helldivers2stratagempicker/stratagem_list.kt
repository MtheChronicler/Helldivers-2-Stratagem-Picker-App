package com.example.helldivers2stratagempicker

class Stratagem(val name:String, val typ: String, val enemy:String, val tags: List<String>)

val stratagemList: List<Stratagem> = listOf(
    //orbital
    Stratagem(name="orbital_precision", typ="orbital", enemy="any", tags=listOf()),
    Stratagem(name="orbital_airburst", typ="orbital", enemy="any", tags=listOf()),
    Stratagem(name="orbital_120mm", typ="orbital", enemy="any", tags=listOf()),
    Stratagem(name="orbital_380mm", typ="orbital", enemy="any", tags=listOf()),
    Stratagem(name="orbital_walking", typ="orbital", enemy="any", tags=listOf()),
    Stratagem(name="orbital_laser", typ="orbital", enemy="any", tags=listOf()),
    Stratagem(name="orbital_railcannon", typ="orbital", enemy="any", tags=listOf()),
    Stratagem(name="orbital_gatling", typ="orbital", enemy="any", tags=listOf()),
    Stratagem(name="orbital_gas", typ="orbital", enemy="any", tags=listOf()),
    Stratagem(name="orbital_ems", typ="orbital", enemy="any", tags=listOf()),
    Stratagem(name="orbital_smoke", typ="orbital", enemy="automatons", tags=listOf("smoke")),
    //eagle
    Stratagem(name="eagle_strafing", typ="eagle", enemy="any", tags=listOf()),
    Stratagem(name="eagle_airstrike", typ="eagle", enemy="any", tags=listOf()),
    Stratagem(name="eagle_cluster", typ="eagle", enemy="any", tags=listOf()),
    Stratagem(name="eagle_napalm", typ="eagle", enemy="any", tags=listOf()),
    Stratagem(name="eagle_smoke", typ="eagle", enemy="automatons", tags=listOf("smoke")),
    Stratagem(name="eagle_110mm", typ="eagle", enemy="any", tags=listOf()),
    Stratagem(name="eagle_500kg", typ="eagle", enemy="any", tags=listOf()),
    //support_weapon
    Stratagem(name="weapon_autocannon", typ="weapon", enemy="any", tags=listOf("backpack")),
    Stratagem(name="weapon_eat", typ="weapon", enemy="any", tags=listOf()),
    Stratagem(name="weapon_flamethrower", typ="weapon", enemy="terminids", tags=listOf()),
    Stratagem(name="weapon_laser_cannon", typ="weapon", enemy="any", tags=listOf()),
    Stratagem(name="weapon_stalwart", typ="weapon", enemy="terminids", tags=listOf()),
    Stratagem(name="weapon_machine_gun", typ="weapon", enemy="any", tags=listOf()),
    Stratagem(name="weapon_arc_thrower", typ="weapon", enemy="any", tags=listOf()),
    Stratagem(name="weapon_grenade_launcher", typ="weapon", enemy="any", tags=listOf()),
    Stratagem(name="weapon_anti_materiel", typ="weapon", enemy="any", tags=listOf()),
    Stratagem(name="weapon_railgun", typ="weapon", enemy="any", tags=listOf()),
    Stratagem(name="weapon_recoiless", typ="weapon", enemy="any", tags=listOf("backpack")),
    Stratagem(name="weapon_spear", typ="weapon", enemy="any", tags=listOf("backpack")),
    Stratagem(name="weapon_quasar", typ="weapon", enemy="any", tags=listOf()),
    Stratagem(name="weapon_heavy_machine_gun", typ="weapon", enemy="any", tags=listOf()),
    Stratagem(name="weapon_airburst", typ="weapon", enemy="any", tags=listOf("backpack")),
    //backpack
    Stratagem(name="backpack_guard_dog_laser", typ="backpack", enemy="any", tags=listOf("backpack")),
    Stratagem(name="backpack_guard_dog_machine_gun", typ="backpack", enemy="any", tags=listOf("backpack")),
    Stratagem(name="backpack_jump_pack", typ="backpack", enemy="any", tags=listOf("backpack")),
    Stratagem(name="backpack_supply", typ="backpack", enemy="any", tags=listOf("backpack")),
    Stratagem(name="backpack_shield_generator", typ="backpack", enemy="any", tags=listOf("backpack")),
    Stratagem(name="backpack_ballistic_shield", typ="backpack", enemy="automatons", tags=listOf("backpack")),
    //sentry
    Stratagem(name="sentry_tesla", typ="sentry", enemy="any", tags=listOf()),
    Stratagem(name="sentry_mortar", typ="sentry", enemy="any", tags=listOf()),
    Stratagem(name="sentry_ems_mortar", typ="sentry", enemy="any", tags=listOf()),
    Stratagem(name="sentry_machine_gun", typ="sentry", enemy="any", tags=listOf()),
    Stratagem(name="sentry_gatling", typ="sentry", enemy="any", tags=listOf()),
    Stratagem(name="sentry_autocannon", typ="sentry", enemy="any", tags=listOf()),
    Stratagem(name="sentry_rocket", typ="sentry", enemy="any", tags=listOf()),
    //emplacement
    Stratagem(name="emplacement_mines", typ="emplacement", enemy="any", tags=listOf("mines")),
    Stratagem(name="emplacement_mines_incendiary", typ="emplacement", enemy="any", tags=listOf("mines")),
    Stratagem(name="emplacement_shield_generator", typ="emplacement", enemy="automatons", tags=listOf()),
    Stratagem(name="emplacement_hmg", typ="emplacement", enemy="any", tags=listOf()),
    //vehicle
    Stratagem(name="vehicle_patriot", typ="vehicle", enemy="any", tags=listOf())
)