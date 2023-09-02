**Update Checklist**

When updating this mod you now have a few places you need to look at.

  * update the version number
     * in src/fabric.mod.json under “version”: “1.1.0+1.19.2”
     * in gradle.properties (typically) under mod_version = 1.1.0+1.19.2
     * in .github/workflows/publish.yml under VERSION: 1.1.0+1.19.2 and RELEASE_NAME: Example Mod 1.1.0 for Minecraft 1.19.2
  * update the changelog in CHANGELOG.md
   *(if you use the recommended workflow) Merge the update branch into the current default branch

