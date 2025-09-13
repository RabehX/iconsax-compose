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


val Iconsax.Filled.Export1: ImageVector
    get() {
        if (_Export1 != null) {
            return _Export1!!
        }
        _Export1 = ImageVector.Builder(
            name = "Filled.Export1",
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
                moveTo(17.25f, 12.33f)
                curveTo(17.25f, 12.74f, 16.91f, 13.08f, 16.5f, 13.08f)
                curveTo(16.09f, 13.08f, 15.75f, 12.74f, 15.75f, 12.33f)
                verticalLineTo(9.31f)
                lineTo(8.03f, 17.03f)
                curveTo(7.88f, 17.18f, 7.69f, 17.25f, 7.5f, 17.25f)
                curveTo(7.31f, 17.25f, 7.12f, 17.18f, 6.97f, 17.03f)
                curveTo(6.68f, 16.74f, 6.68f, 16.26f, 6.97f, 15.97f)
                lineTo(14.69f, 8.25f)
                horizontalLineTo(11.67f)
                curveTo(11.26f, 8.25f, 10.92f, 7.91f, 10.92f, 7.5f)
                curveTo(10.92f, 7.09f, 11.26f, 6.75f, 11.67f, 6.75f)
                horizontalLineTo(16.5f)
                curveTo(16.91f, 6.75f, 17.25f, 7.09f, 17.25f, 7.5f)
                verticalLineTo(12.33f)
                close()
            }
        }.build()

        return _Export1!!
    }

@Suppress("ObjectPropertyName")
private var _Export1: ImageVector? = null
