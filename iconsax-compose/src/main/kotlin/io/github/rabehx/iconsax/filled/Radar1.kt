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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.Radar1: ImageVector
    get() {
        if (_Radar1 != null) {
            return _Radar1!!
        }
        _Radar1 = ImageVector.Builder(
            name = "Filled.Radar1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(12f, 19.75f)
                curveTo(7.73f, 19.75f, 4.25f, 16.27f, 4.25f, 12f)
                curveTo(4.25f, 10.64f, 4.61f, 9.31f, 5.28f, 8.14f)
                curveTo(5.48f, 7.78f, 5.94f, 7.66f, 6.3f, 7.86f)
                lineTo(12.37f, 11.35f)
                curveTo(12.73f, 11.56f, 12.85f, 12.01f, 12.65f, 12.37f)
                curveTo(12.44f, 12.73f, 11.99f, 12.85f, 11.63f, 12.65f)
                lineTo(6.24f, 9.56f)
                curveTo(5.92f, 10.33f, 5.75f, 11.16f, 5.75f, 12f)
                curveTo(5.75f, 15.45f, 8.55f, 18.25f, 12f, 18.25f)
                curveTo(15.45f, 18.25f, 18.25f, 15.45f, 18.25f, 12f)
                curveTo(18.25f, 8.55f, 15.45f, 5.75f, 12f, 5.75f)
                curveTo(10.64f, 5.75f, 9.34f, 6.18f, 8.25f, 7f)
                curveTo(7.92f, 7.25f, 7.45f, 7.18f, 7.2f, 6.85f)
                curveTo(6.95f, 6.52f, 7.02f, 6.05f, 7.35f, 5.8f)
                curveTo(8.7f, 4.79f, 10.31f, 4.25f, 12f, 4.25f)
                curveTo(16.27f, 4.25f, 19.75f, 7.73f, 19.75f, 12f)
                curveTo(19.75f, 16.27f, 16.27f, 19.75f, 12f, 19.75f)
                close()
            }
        }.build()

        return _Radar1!!
    }

@Suppress("ObjectPropertyName")
private var _Radar1: ImageVector? = null
