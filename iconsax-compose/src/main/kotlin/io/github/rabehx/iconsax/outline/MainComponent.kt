/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.MainComponent: ImageVector
    get() {
        if (_MainComponent != null) {
            return _MainComponent!!
        }
        _MainComponent = ImageVector.Builder(
            name = "Outline.MainComponent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(10.83f, 22.75f, 9.74f, 22.3f, 8.92f, 21.48f)
                lineTo(2.53f, 15.09f)
                curveTo(1.71f, 14.27f, 1.26f, 13.17f, 1.26f, 12.01f)
                curveTo(1.26f, 10.85f, 1.71f, 9.75f, 2.53f, 8.93f)
                lineTo(8.92f, 2.54f)
                curveTo(9.74f, 1.72f, 10.84f, 1.27f, 12f, 1.27f)
                curveTo(13.16f, 1.27f, 14.26f, 1.72f, 15.08f, 2.54f)
                lineTo(21.47f, 8.93f)
                curveTo(22.29f, 9.75f, 22.74f, 10.85f, 22.74f, 12.01f)
                curveTo(22.74f, 13.17f, 22.29f, 14.27f, 21.47f, 15.09f)
                lineTo(15.08f, 21.48f)
                curveTo(14.26f, 22.3f, 13.17f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(11.23f, 2.75f, 10.51f, 3.05f, 9.98f, 3.58f)
                lineTo(3.59f, 9.97f)
                curveTo(3.05f, 10.51f, 2.76f, 11.23f, 2.76f, 11.99f)
                curveTo(2.76f, 12.75f, 3.06f, 13.48f, 3.59f, 14.01f)
                lineTo(9.98f, 20.4f)
                curveTo(11.05f, 21.47f, 12.95f, 21.47f, 14.02f, 20.4f)
                lineTo(20.41f, 14.01f)
                curveTo(20.95f, 13.47f, 21.24f, 12.76f, 21.24f, 11.99f)
                curveTo(21.24f, 11.22f, 20.94f, 10.5f, 20.41f, 9.97f)
                lineTo(14.02f, 3.58f)
                curveTo(13.49f, 3.05f, 12.77f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.75f, 18.5f)
                curveTo(17.559f, 18.5f, 17.369f, 18.43f, 17.219f, 18.28f)
                lineTo(5.719f, 6.78f)
                curveTo(5.429f, 6.49f, 5.429f, 6.01f, 5.719f, 5.72f)
                curveTo(6.009f, 5.43f, 6.489f, 5.43f, 6.779f, 5.72f)
                lineTo(18.279f, 17.22f)
                curveTo(18.569f, 17.51f, 18.569f, 17.99f, 18.279f, 18.28f)
                curveTo(18.129f, 18.43f, 17.94f, 18.5f, 17.75f, 18.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.249f, 18.5f)
                curveTo(6.059f, 18.5f, 5.869f, 18.43f, 5.719f, 18.28f)
                curveTo(5.429f, 17.99f, 5.429f, 17.51f, 5.719f, 17.22f)
                lineTo(17.219f, 5.72f)
                curveTo(17.51f, 5.43f, 17.99f, 5.43f, 18.279f, 5.72f)
                curveTo(18.569f, 6.01f, 18.569f, 6.49f, 18.279f, 6.78f)
                lineTo(6.779f, 18.28f)
                curveTo(6.629f, 18.43f, 6.439f, 18.5f, 6.249f, 18.5f)
                close()
            }
        }.build()

        return _MainComponent!!
    }

@Suppress("ObjectPropertyName")
private var _MainComponent: ImageVector? = null
