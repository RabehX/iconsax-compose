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

val Iconsax.Outline.Ticket: ImageVector
    get() {
        if (_Ticket != null) {
            return _Ticket!!
        }
        _Ticket = ImageVector.Builder(
            name = "Outline.Ticket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 20.75f)
                horizontalLineTo(7f)
                curveTo(2.59f, 20.75f, 1.25f, 19.41f, 1.25f, 15f)
                verticalLineTo(14.5f)
                curveTo(1.25f, 14.09f, 1.59f, 13.75f, 2f, 13.75f)
                curveTo(2.96f, 13.75f, 3.75f, 12.96f, 3.75f, 12f)
                curveTo(3.75f, 11.04f, 2.96f, 10.25f, 2f, 10.25f)
                curveTo(1.59f, 10.25f, 1.25f, 9.91f, 1.25f, 9.5f)
                verticalLineTo(9f)
                curveTo(1.25f, 4.59f, 2.59f, 3.25f, 7f, 3.25f)
                horizontalLineTo(17f)
                curveTo(21.41f, 3.25f, 22.75f, 4.59f, 22.75f, 9f)
                verticalLineTo(10f)
                curveTo(22.75f, 10.41f, 22.41f, 10.75f, 22f, 10.75f)
                curveTo(21.04f, 10.75f, 20.25f, 11.54f, 20.25f, 12.5f)
                curveTo(20.25f, 13.46f, 21.04f, 14.25f, 22f, 14.25f)
                curveTo(22.41f, 14.25f, 22.75f, 14.59f, 22.75f, 15f)
                curveTo(22.75f, 19.41f, 21.41f, 20.75f, 17f, 20.75f)
                close()
                moveTo(2.75f, 15.16f)
                curveTo(2.77f, 18.6f, 3.48f, 19.25f, 7f, 19.25f)
                horizontalLineTo(17f)
                curveTo(20.34f, 19.25f, 21.15f, 18.66f, 21.24f, 15.66f)
                curveTo(19.81f, 15.32f, 18.75f, 14.03f, 18.75f, 12.5f)
                curveTo(18.75f, 10.97f, 19.82f, 9.68f, 21.25f, 9.34f)
                verticalLineTo(9f)
                curveTo(21.25f, 5.43f, 20.58f, 4.75f, 17f, 4.75f)
                horizontalLineTo(7f)
                curveTo(3.48f, 4.75f, 2.77f, 5.4f, 2.75f, 8.84f)
                curveTo(4.18f, 9.18f, 5.25f, 10.47f, 5.25f, 12f)
                curveTo(5.25f, 13.53f, 4.18f, 14.82f, 2.75f, 15.16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 7.25f)
                curveTo(9.59f, 7.25f, 9.25f, 6.91f, 9.25f, 6.5f)
                verticalLineTo(4f)
                curveTo(9.25f, 3.59f, 9.59f, 3.25f, 10f, 3.25f)
                curveTo(10.41f, 3.25f, 10.75f, 3.59f, 10.75f, 4f)
                verticalLineTo(6.5f)
                curveTo(10.75f, 6.91f, 10.41f, 7.25f, 10f, 7.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 14.58f)
                curveTo(9.59f, 14.58f, 9.25f, 14.24f, 9.25f, 13.83f)
                verticalLineTo(10.16f)
                curveTo(9.25f, 9.75f, 9.59f, 9.41f, 10f, 9.41f)
                curveTo(10.41f, 9.41f, 10.75f, 9.75f, 10.75f, 10.16f)
                verticalLineTo(13.83f)
                curveTo(10.75f, 14.25f, 10.41f, 14.58f, 10f, 14.58f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 20.75f)
                curveTo(9.59f, 20.75f, 9.25f, 20.41f, 9.25f, 20f)
                verticalLineTo(17.5f)
                curveTo(9.25f, 17.09f, 9.59f, 16.75f, 10f, 16.75f)
                curveTo(10.41f, 16.75f, 10.75f, 17.09f, 10.75f, 17.5f)
                verticalLineTo(20f)
                curveTo(10.75f, 20.41f, 10.41f, 20.75f, 10f, 20.75f)
                close()
            }
        }.build()

        return _Ticket!!
    }

@Suppress("ObjectPropertyName")
private var _Ticket: ImageVector? = null
