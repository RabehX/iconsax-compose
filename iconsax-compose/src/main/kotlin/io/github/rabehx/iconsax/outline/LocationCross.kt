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

val Iconsax.Outline.LocationCross: ImageVector
    get() {
        if (_LocationCross != null) {
            return _LocationCross!!
        }
        _LocationCross = ImageVector.Builder(
            name = "Outline.LocationCross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.76f)
                curveTo(10.52f, 22.76f, 9.03f, 22.2f, 7.87f, 21.09f)
                curveTo(4.92f, 18.25f, 1.66f, 13.72f, 2.89f, 8.33f)
                curveTo(4f, 3.44f, 8.27f, 1.25f, 12f, 1.25f)
                curveTo(12f, 1.25f, 12f, 1.25f, 12.01f, 1.25f)
                curveTo(15.74f, 1.25f, 20.01f, 3.44f, 21.12f, 8.34f)
                curveTo(22.34f, 13.73f, 19.08f, 18.25f, 16.13f, 21.09f)
                curveTo(14.97f, 22.2f, 13.48f, 22.76f, 12f, 22.76f)
                close()
                moveTo(12f, 2.75f)
                curveTo(9.09f, 2.75f, 5.35f, 4.3f, 4.36f, 8.66f)
                curveTo(3.28f, 13.37f, 6.24f, 17.43f, 8.92f, 20f)
                curveTo(10.65f, 21.67f, 13.36f, 21.67f, 15.09f, 20f)
                curveTo(17.76f, 17.43f, 20.72f, 13.37f, 19.66f, 8.66f)
                curveTo(18.66f, 4.3f, 14.91f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 13.71f)
                curveTo(13.811f, 13.71f, 13.62f, 13.64f, 13.47f, 13.49f)
                lineTo(9.51f, 9.53f)
                curveTo(9.22f, 9.24f, 9.22f, 8.76f, 9.51f, 8.47f)
                curveTo(9.8f, 8.18f, 10.281f, 8.18f, 10.571f, 8.47f)
                lineTo(14.531f, 12.43f)
                curveTo(14.821f, 12.72f, 14.821f, 13.2f, 14.531f, 13.49f)
                curveTo(14.38f, 13.63f, 14.191f, 13.71f, 14f, 13.71f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.999f, 13.75f)
                curveTo(9.809f, 13.75f, 9.619f, 13.68f, 9.469f, 13.53f)
                curveTo(9.179f, 13.24f, 9.179f, 12.76f, 9.469f, 12.47f)
                lineTo(13.429f, 8.51f)
                curveTo(13.719f, 8.22f, 14.2f, 8.22f, 14.49f, 8.51f)
                curveTo(14.78f, 8.8f, 14.78f, 9.28f, 14.49f, 9.57f)
                lineTo(10.53f, 13.53f)
                curveTo(10.38f, 13.68f, 10.189f, 13.75f, 9.999f, 13.75f)
                close()
            }
        }.build()

        return _LocationCross!!
    }

@Suppress("ObjectPropertyName")
private var _LocationCross: ImageVector? = null
