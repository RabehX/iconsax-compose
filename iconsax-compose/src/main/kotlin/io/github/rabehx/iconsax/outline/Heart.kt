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

val Iconsax.Outline.Heart: ImageVector
    get() {
        if (_Heart != null) {
            return _Heart!!
        }
        _Heart = ImageVector.Builder(
            name = "Outline.Heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 21.65f)
                curveTo(11.69f, 21.65f, 11.39f, 21.61f, 11.14f, 21.52f)
                curveTo(7.32f, 20.21f, 1.25f, 15.56f, 1.25f, 8.69f)
                curveTo(1.25f, 5.19f, 4.08f, 2.35f, 7.56f, 2.35f)
                curveTo(9.25f, 2.35f, 10.83f, 3.01f, 12f, 4.19f)
                curveTo(13.17f, 3.01f, 14.75f, 2.35f, 16.44f, 2.35f)
                curveTo(19.92f, 2.35f, 22.75f, 5.2f, 22.75f, 8.69f)
                curveTo(22.75f, 15.57f, 16.68f, 20.21f, 12.86f, 21.52f)
                curveTo(12.61f, 21.61f, 12.31f, 21.65f, 12f, 21.65f)
                close()
                moveTo(7.56f, 3.85f)
                curveTo(4.91f, 3.85f, 2.75f, 6.02f, 2.75f, 8.69f)
                curveTo(2.75f, 15.52f, 9.32f, 19.32f, 11.63f, 20.11f)
                curveTo(11.81f, 20.17f, 12.2f, 20.17f, 12.38f, 20.11f)
                curveTo(14.68f, 19.32f, 21.26f, 15.53f, 21.26f, 8.69f)
                curveTo(21.26f, 6.02f, 19.1f, 3.85f, 16.45f, 3.85f)
                curveTo(14.93f, 3.85f, 13.52f, 4.56f, 12.61f, 5.79f)
                curveTo(12.33f, 6.17f, 11.69f, 6.17f, 11.41f, 5.79f)
                curveTo(10.48f, 4.55f, 9.08f, 3.85f, 7.56f, 3.85f)
                close()
            }
        }.build()

        return _Heart!!
    }

@Suppress("ObjectPropertyName")
private var _Heart: ImageVector? = null
