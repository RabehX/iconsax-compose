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

val Iconsax.Outline.Sound: ImageVector
    get() {
        if (_Sound != null) {
            return _Sound!!
        }
        _Sound = ImageVector.Builder(
            name = "Outline.Sound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3f, 16.5f)
                curveTo(2.59f, 16.5f, 2.25f, 16.16f, 2.25f, 15.75f)
                verticalLineTo(8.25f)
                curveTo(2.25f, 7.84f, 2.59f, 7.5f, 3f, 7.5f)
                curveTo(3.41f, 7.5f, 3.75f, 7.84f, 3.75f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(3.75f, 16.16f, 3.41f, 16.5f, 3f, 16.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.5f, 19f)
                curveTo(7.09f, 19f, 6.75f, 18.66f, 6.75f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(6.75f, 5.34f, 7.09f, 5f, 7.5f, 5f)
                curveTo(7.91f, 5f, 8.25f, 5.34f, 8.25f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(8.25f, 18.66f, 7.91f, 19f, 7.5f, 19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 21.5f)
                curveTo(11.59f, 21.5f, 11.25f, 21.16f, 11.25f, 20.75f)
                verticalLineTo(3.25f)
                curveTo(11.25f, 2.84f, 11.59f, 2.5f, 12f, 2.5f)
                curveTo(12.41f, 2.5f, 12.75f, 2.84f, 12.75f, 3.25f)
                verticalLineTo(20.75f)
                curveTo(12.75f, 21.16f, 12.41f, 21.5f, 12f, 21.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 19f)
                curveTo(16.09f, 19f, 15.75f, 18.66f, 15.75f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(15.75f, 5.34f, 16.09f, 5f, 16.5f, 5f)
                curveTo(16.91f, 5f, 17.25f, 5.34f, 17.25f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(17.25f, 18.66f, 16.91f, 19f, 16.5f, 19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 16.5f)
                curveTo(20.59f, 16.5f, 20.25f, 16.16f, 20.25f, 15.75f)
                verticalLineTo(8.25f)
                curveTo(20.25f, 7.84f, 20.59f, 7.5f, 21f, 7.5f)
                curveTo(21.41f, 7.5f, 21.75f, 7.84f, 21.75f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(21.75f, 16.16f, 21.41f, 16.5f, 21f, 16.5f)
                close()
            }
        }.build()

        return _Sound!!
    }

@Suppress("ObjectPropertyName")
private var _Sound: ImageVector? = null
