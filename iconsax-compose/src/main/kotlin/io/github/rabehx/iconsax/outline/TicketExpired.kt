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

val Iconsax.Outline.TicketExpired: ImageVector
    get() {
        if (_TicketExpired != null) {
            return _TicketExpired!!
        }
        _TicketExpired = ImageVector.Builder(
            name = "Outline.TicketExpired",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.38f, 20.75f)
                horizontalLineTo(10.91f)
                curveTo(10.5f, 20.75f, 10.16f, 20.41f, 10.16f, 20f)
                curveTo(10.16f, 19.59f, 10.5f, 19.25f, 10.91f, 19.25f)
                horizontalLineTo(17.38f)
                curveTo(20.44f, 19.25f, 21.16f, 18.75f, 21.24f, 16.03f)
                curveTo(19.92f, 15.69f, 18.94f, 14.49f, 18.94f, 13.07f)
                curveTo(18.94f, 11.64f, 19.92f, 10.43f, 21.25f, 10.09f)
                verticalLineTo(9.83f)
                curveTo(21.25f, 6.54f, 20.67f, 5.96f, 17.38f, 5.96f)
                horizontalLineTo(11.75f)
                verticalLineTo(12f)
                curveTo(11.75f, 12.41f, 11.41f, 12.75f, 11f, 12.75f)
                curveTo(10.59f, 12.75f, 10.25f, 12.41f, 10.25f, 12f)
                verticalLineTo(5.21f)
                curveTo(10.25f, 4.8f, 10.59f, 4.46f, 11f, 4.46f)
                horizontalLineTo(17.38f)
                curveTo(21.5f, 4.46f, 22.75f, 5.71f, 22.75f, 9.83f)
                verticalLineTo(10.75f)
                curveTo(22.75f, 11.16f, 22.41f, 11.5f, 22f, 11.5f)
                curveTo(21.14f, 11.5f, 20.44f, 12.2f, 20.44f, 13.07f)
                curveTo(20.44f, 13.93f, 21.14f, 14.63f, 22f, 14.63f)
                curveTo(22.41f, 14.63f, 22.75f, 14.97f, 22.75f, 15.38f)
                curveTo(22.75f, 19.5f, 21.5f, 20.75f, 17.38f, 20.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 20.75f)
                horizontalLineTo(8.23f)
                curveTo(6.21f, 20.75f, 5.17f, 19.23f, 4.22f, 16.95f)
                lineTo(4.03f, 16.49f)
                curveTo(3.96f, 16.31f, 3.96f, 16.1f, 4.04f, 15.92f)
                curveTo(4.12f, 15.74f, 4.27f, 15.59f, 4.45f, 15.52f)
                curveTo(4.85f, 15.36f, 5.16f, 15.05f, 5.33f, 14.66f)
                curveTo(5.5f, 14.26f, 5.5f, 13.82f, 5.33f, 13.42f)
                curveTo(5f, 12.58f, 4.05f, 12.19f, 3.21f, 12.52f)
                curveTo(3.02f, 12.6f, 2.82f, 12.59f, 2.63f, 12.51f)
                curveTo(2.45f, 12.43f, 2.3f, 12.28f, 2.23f, 12.1f)
                lineTo(2.06f, 11.67f)
                curveTo(0.46f, 7.78f, 1.16f, 6.11f, 5.05f, 4.5f)
                lineTo(7.69f, 3.42f)
                curveTo(8.07f, 3.26f, 8.51f, 3.45f, 8.67f, 3.83f)
                lineTo(11.7f, 11.17f)
                curveTo(11.74f, 11.26f, 11.76f, 11.36f, 11.76f, 11.46f)
                verticalLineTo(14f)
                curveTo(11.76f, 14.41f, 11.42f, 14.75f, 11.01f, 14.75f)
                curveTo(10.6f, 14.75f, 10.26f, 14.41f, 10.26f, 14f)
                verticalLineTo(11.6f)
                lineTo(7.56f, 5.09f)
                lineTo(5.62f, 5.89f)
                curveTo(2.54f, 7.16f, 2.17f, 7.94f, 3.38f, 10.94f)
                curveTo(4.77f, 10.74f, 6.17f, 11.49f, 6.72f, 12.84f)
                curveTo(7.04f, 13.61f, 7.04f, 14.46f, 6.71f, 15.23f)
                curveTo(6.49f, 15.76f, 6.13f, 16.21f, 5.67f, 16.54f)
                curveTo(6.63f, 18.8f, 7.33f, 19.25f, 8.22f, 19.25f)
                horizontalLineTo(10.24f)
                verticalLineTo(17f)
                curveTo(10.24f, 16.59f, 10.58f, 16.25f, 10.99f, 16.25f)
                curveTo(11.4f, 16.25f, 11.74f, 16.59f, 11.74f, 17f)
                verticalLineTo(20f)
                curveTo(11.75f, 20.41f, 11.41f, 20.75f, 11f, 20.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.17f, 20.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 20.75f, 7.25f, 20.41f, 7.25f, 20f)
                curveTo(7.25f, 19.59f, 7.59f, 19.25f, 8f, 19.25f)
                horizontalLineTo(8.17f)
                curveTo(8.58f, 19.25f, 8.92f, 19.59f, 8.92f, 20f)
                curveTo(8.92f, 20.41f, 8.58f, 20.75f, 8.17f, 20.75f)
                close()
            }
        }.build()

        return _TicketExpired!!
    }

@Suppress("ObjectPropertyName")
private var _TicketExpired: ImageVector? = null
