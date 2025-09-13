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

val Iconsax.Outline.AlignRight: ImageVector
    get() {
        if (_AlignRight != null) {
            return _AlignRight!!
        }
        _AlignRight = ImageVector.Builder(
            name = "Outline.AlignRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.9f, 20f)
                horizontalLineTo(7.1f)
                curveTo(5.18f, 20f, 4.25f, 19.02f, 4.25f, 17.02f)
                verticalLineTo(15.98f)
                curveTo(4.25f, 13.98f, 5.18f, 13f, 7.1f, 13f)
                horizontalLineTo(18.9f)
                curveTo(19.31f, 13f, 19.65f, 13.34f, 19.65f, 13.75f)
                curveTo(19.65f, 14.16f, 19.31f, 14.5f, 18.9f, 14.5f)
                horizontalLineTo(7.1f)
                curveTo(6.09f, 14.5f, 5.75f, 14.71f, 5.75f, 15.98f)
                verticalLineTo(17.02f)
                curveTo(5.75f, 18.29f, 6.09f, 18.5f, 7.1f, 18.5f)
                horizontalLineTo(18.9f)
                curveTo(19.31f, 18.5f, 19.65f, 18.84f, 19.65f, 19.25f)
                curveTo(19.65f, 19.66f, 19.31f, 20f, 18.9f, 20f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.9f, 11.5f)
                horizontalLineTo(12.1f)
                curveTo(10.18f, 11.5f, 9.25f, 10.52f, 9.25f, 8.52f)
                verticalLineTo(7.48f)
                curveTo(9.25f, 5.47f, 10.18f, 4.5f, 12.1f, 4.5f)
                horizontalLineTo(18.9f)
                curveTo(19.31f, 4.5f, 19.65f, 4.84f, 19.65f, 5.25f)
                curveTo(19.65f, 5.66f, 19.31f, 6f, 18.9f, 6f)
                horizontalLineTo(12.1f)
                curveTo(11.09f, 6f, 10.75f, 6.21f, 10.75f, 7.48f)
                verticalLineTo(8.52f)
                curveTo(10.75f, 9.79f, 11.09f, 10f, 12.1f, 10f)
                horizontalLineTo(18.9f)
                curveTo(19.31f, 10f, 19.65f, 10.34f, 19.65f, 10.75f)
                curveTo(19.65f, 11.16f, 19.31f, 11.5f, 18.9f, 11.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 22.74f)
                curveTo(18.59f, 22.74f, 18.25f, 22.4f, 18.25f, 21.99f)
                verticalLineTo(1.99f)
                curveTo(18.25f, 1.58f, 18.59f, 1.24f, 19f, 1.24f)
                curveTo(19.41f, 1.24f, 19.75f, 1.58f, 19.75f, 1.99f)
                verticalLineTo(21.99f)
                curveTo(19.75f, 22.4f, 19.41f, 22.74f, 19f, 22.74f)
                close()
            }
        }.build()

        return _AlignRight!!
    }

@Suppress("ObjectPropertyName")
private var _AlignRight: ImageVector? = null
