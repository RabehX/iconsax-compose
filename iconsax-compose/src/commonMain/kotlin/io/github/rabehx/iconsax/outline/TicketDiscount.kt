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

val Iconsax.Outline.TicketDiscount: ImageVector
    get() {
        if (_TicketDiscount != null) {
            return _TicketDiscount!!
        }
        _TicketDiscount = ImageVector.Builder(
            name = "Outline.TicketDiscount",
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
                curveTo(21.25f, 5.43f, 20.57f, 4.75f, 17f, 4.75f)
                horizontalLineTo(7f)
                curveTo(3.48f, 4.75f, 2.77f, 5.4f, 2.75f, 8.84f)
                curveTo(4.18f, 9.18f, 5.25f, 10.47f, 5.25f, 12f)
                curveTo(5.25f, 13.53f, 4.18f, 14.82f, 2.75f, 15.16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 15.88f)
                curveTo(14.44f, 15.88f, 13.99f, 15.43f, 13.99f, 14.88f)
                curveTo(13.99f, 14.33f, 14.44f, 13.88f, 14.99f, 13.88f)
                curveTo(15.54f, 13.88f, 15.99f, 14.33f, 15.99f, 14.88f)
                curveTo(15.99f, 15.43f, 15.56f, 15.88f, 15f, 15.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 10.88f)
                curveTo(8.44f, 10.88f, 7.99f, 10.43f, 7.99f, 9.88f)
                curveTo(7.99f, 9.33f, 8.44f, 8.88f, 8.99f, 8.88f)
                curveTo(9.54f, 8.88f, 9.99f, 9.33f, 9.99f, 9.88f)
                curveTo(9.99f, 10.43f, 9.56f, 10.88f, 9f, 10.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.63f, 16.43f)
                curveTo(8.44f, 16.43f, 8.25f, 16.36f, 8.1f, 16.21f)
                curveTo(7.81f, 15.92f, 7.81f, 15.44f, 8.1f, 15.15f)
                lineTo(14.83f, 8.42f)
                curveTo(15.12f, 8.13f, 15.6f, 8.13f, 15.89f, 8.42f)
                curveTo(16.18f, 8.71f, 16.18f, 9.19f, 15.89f, 9.48f)
                lineTo(9.16f, 16.21f)
                curveTo(9.02f, 16.36f, 8.82f, 16.43f, 8.63f, 16.43f)
                close()
            }
        }.build()

        return _TicketDiscount!!
    }

@Suppress("ObjectPropertyName")
private var _TicketDiscount: ImageVector? = null
