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


val Iconsax.Filled.TicketDiscount: ImageVector
    get() {
        if (_TicketDiscount != null) {
            return _TicketDiscount!!
        }
        _TicketDiscount = ImageVector.Builder(
            name = "Filled.TicketDiscount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.3f, 10.839f)
                curveTo(21.69f, 10.839f, 22f, 10.529f, 22f, 10.139f)
                verticalLineTo(9.209f)
                curveTo(22f, 5.109f, 20.75f, 3.859f, 16.65f, 3.859f)
                horizontalLineTo(7.35f)
                curveTo(3.25f, 3.859f, 2f, 5.109f, 2f, 9.209f)
                verticalLineTo(9.679f)
                curveTo(2f, 10.069f, 2.31f, 10.379f, 2.7f, 10.379f)
                curveTo(3.6f, 10.379f, 4.33f, 11.109f, 4.33f, 12.009f)
                curveTo(4.33f, 12.909f, 3.6f, 13.629f, 2.7f, 13.629f)
                curveTo(2.31f, 13.629f, 2f, 13.939f, 2f, 14.329f)
                verticalLineTo(14.799f)
                curveTo(2f, 18.899f, 3.25f, 20.149f, 7.35f, 20.149f)
                horizontalLineTo(16.65f)
                curveTo(20.75f, 20.149f, 22f, 18.899f, 22f, 14.799f)
                curveTo(22f, 14.409f, 21.69f, 14.099f, 21.3f, 14.099f)
                curveTo(20.4f, 14.099f, 19.67f, 13.369f, 19.67f, 12.469f)
                curveTo(19.67f, 11.569f, 20.4f, 10.839f, 21.3f, 10.839f)
                close()
                moveTo(9f, 8.879f)
                curveTo(9.55f, 8.879f, 10f, 9.329f, 10f, 9.879f)
                curveTo(10f, 10.429f, 9.56f, 10.879f, 9f, 10.879f)
                curveTo(8.45f, 10.879f, 8f, 10.429f, 8f, 9.879f)
                curveTo(8f, 9.329f, 8.44f, 8.879f, 9f, 8.879f)
                close()
                moveTo(15f, 15.879f)
                curveTo(14.44f, 15.879f, 13.99f, 15.429f, 13.99f, 14.879f)
                curveTo(13.99f, 14.329f, 14.44f, 13.879f, 14.99f, 13.879f)
                curveTo(15.54f, 13.879f, 15.99f, 14.329f, 15.99f, 14.879f)
                curveTo(15.99f, 15.429f, 15.56f, 15.879f, 15f, 15.879f)
                close()
                moveTo(15.9f, 9.479f)
                lineTo(9.17f, 16.209f)
                curveTo(9.02f, 16.359f, 8.83f, 16.429f, 8.64f, 16.429f)
                curveTo(8.45f, 16.429f, 8.26f, 16.359f, 8.11f, 16.209f)
                curveTo(7.82f, 15.919f, 7.82f, 15.439f, 8.11f, 15.149f)
                lineTo(14.84f, 8.419f)
                curveTo(15.13f, 8.129f, 15.61f, 8.129f, 15.9f, 8.419f)
                curveTo(16.19f, 8.709f, 16.19f, 9.189f, 15.9f, 9.479f)
                close()
            }
        }.build()

        return _TicketDiscount!!
    }

@Suppress("ObjectPropertyName")
private var _TicketDiscount: ImageVector? = null
