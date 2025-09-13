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


val Iconsax.Filled.Ticket: ImageVector
    get() {
        if (_Ticket != null) {
            return _Ticket!!
        }
        _Ticket = ImageVector.Builder(
            name = "Filled.Ticket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 10.75f)
                curveTo(22.41f, 10.75f, 22.75f, 10.41f, 22.75f, 10f)
                verticalLineTo(9f)
                curveTo(22.75f, 4.59f, 21.41f, 3.25f, 17f, 3.25f)
                horizontalLineTo(10.75f)
                verticalLineTo(5.5f)
                curveTo(10.75f, 5.91f, 10.41f, 6.25f, 10f, 6.25f)
                curveTo(9.59f, 6.25f, 9.25f, 5.91f, 9.25f, 5.5f)
                verticalLineTo(3.25f)
                horizontalLineTo(7f)
                curveTo(2.59f, 3.25f, 1.25f, 4.59f, 1.25f, 9f)
                verticalLineTo(9.5f)
                curveTo(1.25f, 9.91f, 1.59f, 10.25f, 2f, 10.25f)
                curveTo(2.96f, 10.25f, 3.75f, 11.04f, 3.75f, 12f)
                curveTo(3.75f, 12.96f, 2.96f, 13.75f, 2f, 13.75f)
                curveTo(1.59f, 13.75f, 1.25f, 14.09f, 1.25f, 14.5f)
                verticalLineTo(15f)
                curveTo(1.25f, 19.41f, 2.59f, 20.75f, 7f, 20.75f)
                horizontalLineTo(9.25f)
                verticalLineTo(18.5f)
                curveTo(9.25f, 18.09f, 9.59f, 17.75f, 10f, 17.75f)
                curveTo(10.41f, 17.75f, 10.75f, 18.09f, 10.75f, 18.5f)
                verticalLineTo(20.75f)
                horizontalLineTo(17f)
                curveTo(21.41f, 20.75f, 22.75f, 19.41f, 22.75f, 15f)
                curveTo(22.75f, 14.59f, 22.41f, 14.25f, 22f, 14.25f)
                curveTo(21.04f, 14.25f, 20.25f, 13.46f, 20.25f, 12.5f)
                curveTo(20.25f, 11.54f, 21.04f, 10.75f, 22f, 10.75f)
                close()
                moveTo(10.75f, 14.17f)
                curveTo(10.75f, 14.58f, 10.41f, 14.92f, 10f, 14.92f)
                curveTo(9.59f, 14.92f, 9.25f, 14.58f, 9.25f, 14.17f)
                verticalLineTo(9.83f)
                curveTo(9.25f, 9.42f, 9.59f, 9.08f, 10f, 9.08f)
                curveTo(10.41f, 9.08f, 10.75f, 9.42f, 10.75f, 9.83f)
                verticalLineTo(14.17f)
                close()
            }
        }.build()

        return _Ticket!!
    }

@Suppress("ObjectPropertyName")
private var _Ticket: ImageVector? = null
