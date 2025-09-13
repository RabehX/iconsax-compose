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

val Iconsax.Outline.Play: ImageVector
    get() {
        if (_Play != null) {
            return _Play!!
        }
        _Play = ImageVector.Builder(
            name = "Outline.Play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.87f, 21.28f)
                curveTo(7.08f, 21.28f, 6.33f, 21.09f, 5.67f, 20.71f)
                curveTo(4.11f, 19.81f, 3.25f, 17.98f, 3.25f, 15.57f)
                verticalLineTo(8.44f)
                curveTo(3.25f, 6.02f, 4.11f, 4.2f, 5.67f, 3.3f)
                curveTo(7.23f, 2.4f, 9.24f, 2.57f, 11.34f, 3.78f)
                lineTo(17.51f, 7.34f)
                curveTo(19.6f, 8.55f, 20.76f, 10.21f, 20.76f, 12.01f)
                curveTo(20.76f, 13.81f, 19.61f, 15.47f, 17.51f, 16.68f)
                lineTo(11.34f, 20.24f)
                curveTo(10.13f, 20.93f, 8.95f, 21.28f, 7.87f, 21.28f)
                close()
                moveTo(7.87f, 4.22f)
                curveTo(7.33f, 4.22f, 6.85f, 4.34f, 6.42f, 4.59f)
                curveTo(5.34f, 5.21f, 4.75f, 6.58f, 4.75f, 8.44f)
                verticalLineTo(15.56f)
                curveTo(4.75f, 17.42f, 5.34f, 18.78f, 6.42f, 19.41f)
                curveTo(7.5f, 20.04f, 8.98f, 19.86f, 10.59f, 18.93f)
                lineTo(16.76f, 15.37f)
                curveTo(18.37f, 14.44f, 19.26f, 13.25f, 19.26f, 12f)
                curveTo(19.26f, 10.75f, 18.37f, 9.56f, 16.76f, 8.63f)
                lineTo(10.59f, 5.07f)
                curveTo(9.61f, 4.51f, 8.69f, 4.22f, 7.87f, 4.22f)
                close()
            }
        }.build()

        return _Play!!
    }

@Suppress("ObjectPropertyName")
private var _Play: ImageVector? = null
