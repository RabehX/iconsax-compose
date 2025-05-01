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

val Iconsax.Outline.Mouse: ImageVector
    get() {
        if (_Mouse != null) {
            return _Mouse!!
        }
        _Mouse = ImageVector.Builder(
            name = "Outline.Mouse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(7.45f, 22.75f, 3.75f, 19.05f, 3.75f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(3.75f, 4.95f, 7.45f, 1.25f, 12f, 1.25f)
                curveTo(16.55f, 1.25f, 20.25f, 4.95f, 20.25f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(20.25f, 19.05f, 16.55f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(8.28f, 2.75f, 5.25f, 5.78f, 5.25f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(5.25f, 18.22f, 8.28f, 21.25f, 12f, 21.25f)
                curveTo(15.72f, 21.25f, 18.75f, 18.22f, 18.75f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(18.75f, 5.78f, 15.72f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 11.75f)
                curveTo(10.76f, 11.75f, 9.75f, 10.74f, 9.75f, 9.5f)
                verticalLineTo(7.5f)
                curveTo(9.75f, 6.26f, 10.76f, 5.25f, 12f, 5.25f)
                curveTo(13.24f, 5.25f, 14.25f, 6.26f, 14.25f, 7.5f)
                verticalLineTo(9.5f)
                curveTo(14.25f, 10.74f, 13.24f, 11.75f, 12f, 11.75f)
                close()
                moveTo(12f, 6.75f)
                curveTo(11.59f, 6.75f, 11.25f, 7.09f, 11.25f, 7.5f)
                verticalLineTo(9.5f)
                curveTo(11.25f, 9.91f, 11.59f, 10.25f, 12f, 10.25f)
                curveTo(12.41f, 10.25f, 12.75f, 9.91f, 12.75f, 9.5f)
                verticalLineTo(7.5f)
                curveTo(12.75f, 7.09f, 12.41f, 6.75f, 12f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 6.75f)
                curveTo(11.59f, 6.75f, 11.25f, 6.41f, 11.25f, 6f)
                verticalLineTo(2f)
                curveTo(11.25f, 1.59f, 11.59f, 1.25f, 12f, 1.25f)
                curveTo(12.41f, 1.25f, 12.75f, 1.59f, 12.75f, 2f)
                verticalLineTo(6f)
                curveTo(12.75f, 6.41f, 12.41f, 6.75f, 12f, 6.75f)
                close()
            }
        }.build()

        return _Mouse!!
    }

@Suppress("ObjectPropertyName")
private var _Mouse: ImageVector? = null
