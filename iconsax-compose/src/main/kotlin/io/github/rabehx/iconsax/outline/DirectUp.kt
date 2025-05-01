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

val Iconsax.Outline.DirectUp: ImageVector
    get() {
        if (_DirectUp != null) {
            return _DirectUp!!
        }
        _DirectUp = ImageVector.Builder(
            name = "Outline.DirectUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.12f, 21.75f)
                curveTo(17.52f, 21.75f, 16.91f, 21.61f, 16.33f, 21.32f)
                lineTo(13.09f, 19.7f)
                curveTo(12.41f, 19.36f, 11.59f, 19.36f, 10.9f, 19.7f)
                lineTo(7.66f, 21.32f)
                curveTo(6.1f, 22.1f, 4.3f, 21.8f, 3.08f, 20.55f)
                curveTo(1.86f, 19.3f, 1.59f, 17.5f, 2.41f, 15.95f)
                lineTo(8.51f, 4.36f)
                curveTo(9.19f, 3.06f, 10.53f, 2.25f, 12f, 2.25f)
                curveTo(13.47f, 2.25f, 14.81f, 3.06f, 15.49f, 4.36f)
                lineTo(21.59f, 15.95f)
                curveTo(22.4f, 17.5f, 22.14f, 19.3f, 20.92f, 20.55f)
                curveTo(20.15f, 21.34f, 19.15f, 21.75f, 18.12f, 21.75f)
                close()
                moveTo(12f, 17.94f)
                curveTo(12.61f, 17.94f, 13.21f, 18.08f, 13.76f, 18.35f)
                lineTo(17f, 19.97f)
                curveTo(18.17f, 20.56f, 19.24f, 20.11f, 19.84f, 19.49f)
                curveTo(20.44f, 18.87f, 20.87f, 17.8f, 20.26f, 16.64f)
                lineTo(14.16f, 5.05f)
                curveTo(13.73f, 4.24f, 12.92f, 3.75f, 12f, 3.75f)
                curveTo(11.08f, 3.75f, 10.27f, 4.24f, 9.84f, 5.06f)
                lineTo(3.74f, 16.65f)
                curveTo(3.13f, 17.81f, 3.55f, 18.89f, 4.16f, 19.5f)
                curveTo(4.77f, 20.11f, 5.83f, 20.56f, 7f, 19.98f)
                lineTo(10.24f, 18.36f)
                curveTo(10.79f, 18.08f, 11.39f, 17.94f, 12f, 17.94f)
                close()
            }
        }.build()

        return _DirectUp!!
    }

@Suppress("ObjectPropertyName")
private var _DirectUp: ImageVector? = null
