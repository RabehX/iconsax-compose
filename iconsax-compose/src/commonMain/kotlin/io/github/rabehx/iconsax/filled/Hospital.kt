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


val Iconsax.Filled.Hospital: ImageVector
    get() {
        if (_Hospital != null) {
            return _Hospital!!
        }
        _Hospital = ImageVector.Builder(
            name = "Filled.Hospital",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 21.25f)
                horizontalLineTo(2f)
                curveTo(1.59f, 21.25f, 1.25f, 21.59f, 1.25f, 22f)
                curveTo(1.25f, 22.41f, 1.59f, 22.75f, 2f, 22.75f)
                horizontalLineTo(22f)
                curveTo(22.41f, 22.75f, 22.75f, 22.41f, 22.75f, 22f)
                curveTo(22.75f, 21.59f, 22.41f, 21.25f, 22f, 21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 2f)
                horizontalLineTo(7f)
                curveTo(4f, 2f, 3f, 3.79f, 3f, 6f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                verticalLineTo(15.94f)
                curveTo(9f, 15.42f, 9.42f, 15f, 9.94f, 15f)
                horizontalLineTo(14.07f)
                curveTo(14.58f, 15f, 15.01f, 15.42f, 15.01f, 15.94f)
                verticalLineTo(22f)
                horizontalLineTo(21.01f)
                verticalLineTo(6f)
                curveTo(21f, 3.79f, 20f, 2f, 17f, 2f)
                close()
                moveTo(14.5f, 9.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(11f)
                curveTo(12.75f, 11.41f, 12.41f, 11.75f, 12f, 11.75f)
                curveTo(11.59f, 11.75f, 11.25f, 11.41f, 11.25f, 11f)
                verticalLineTo(9.25f)
                horizontalLineTo(9.5f)
                curveTo(9.09f, 9.25f, 8.75f, 8.91f, 8.75f, 8.5f)
                curveTo(8.75f, 8.09f, 9.09f, 7.75f, 9.5f, 7.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(6f)
                curveTo(11.25f, 5.59f, 11.59f, 5.25f, 12f, 5.25f)
                curveTo(12.41f, 5.25f, 12.75f, 5.59f, 12.75f, 6f)
                verticalLineTo(7.75f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 7.75f, 15.25f, 8.09f, 15.25f, 8.5f)
                curveTo(15.25f, 8.91f, 14.91f, 9.25f, 14.5f, 9.25f)
                close()
            }
        }.build()

        return _Hospital!!
    }

@Suppress("ObjectPropertyName")
private var _Hospital: ImageVector? = null
