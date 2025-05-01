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

val Iconsax.Outline.Electricity: ImageVector
    get() {
        if (_Electricity != null) {
            return _Electricity!!
        }
        _Electricity = ImageVector.Builder(
            name = "Outline.Electricity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.5f, 16.75f)
                horizontalLineTo(10.5f)
                curveTo(7.75f, 16.75f, 5.75f, 14.75f, 5.75f, 12f)
                verticalLineTo(6.92f)
                curveTo(5.75f, 5.45f, 6.95f, 4.25f, 8.42f, 4.25f)
                horizontalLineTo(15.59f)
                curveTo(17.06f, 4.25f, 18.26f, 5.45f, 18.26f, 6.92f)
                verticalLineTo(12f)
                curveTo(18.25f, 14.75f, 16.25f, 16.75f, 13.5f, 16.75f)
                close()
                moveTo(8.42f, 5.75f)
                curveTo(7.78f, 5.75f, 7.25f, 6.27f, 7.25f, 6.92f)
                verticalLineTo(12f)
                curveTo(7.25f, 13.62f, 8.25f, 15.25f, 10.5f, 15.25f)
                horizontalLineTo(13.5f)
                curveTo(15.75f, 15.25f, 16.75f, 13.62f, 16.75f, 12f)
                verticalLineTo(6.92f)
                curveTo(16.75f, 6.28f, 16.23f, 5.75f, 15.58f, 5.75f)
                horizontalLineTo(8.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.5f, 5.75f)
                curveTo(9.09f, 5.75f, 8.75f, 5.41f, 8.75f, 5f)
                verticalLineTo(2f)
                curveTo(8.75f, 1.59f, 9.09f, 1.25f, 9.5f, 1.25f)
                curveTo(9.91f, 1.25f, 10.25f, 1.59f, 10.25f, 2f)
                verticalLineTo(5f)
                curveTo(10.25f, 5.41f, 9.91f, 5.75f, 9.5f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.5f, 5.75f)
                curveTo(14.09f, 5.75f, 13.75f, 5.41f, 13.75f, 5f)
                verticalLineTo(2f)
                curveTo(13.75f, 1.59f, 14.09f, 1.25f, 14.5f, 1.25f)
                curveTo(14.91f, 1.25f, 15.25f, 1.59f, 15.25f, 2f)
                verticalLineTo(5f)
                curveTo(15.25f, 5.41f, 14.91f, 5.75f, 14.5f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22f)
                verticalLineTo(16f)
                curveTo(11.25f, 15.59f, 11.59f, 15.25f, 12f, 15.25f)
                curveTo(12.41f, 15.25f, 12.75f, 15.59f, 12.75f, 16f)
                verticalLineTo(22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
        }.build()

        return _Electricity!!
    }

@Suppress("ObjectPropertyName")
private var _Electricity: ImageVector? = null
