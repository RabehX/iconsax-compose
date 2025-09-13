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

val Iconsax.Outline.DirectInbox: ImageVector
    get() {
        if (_DirectInbox != null) {
            return _DirectInbox!!
        }
        _DirectInbox = ImageVector.Builder(
            name = "Outline.DirectInbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 9.75f)
                curveTo(11.9f, 9.75f, 11.81f, 9.73f, 11.71f, 9.69f)
                curveTo(11.43f, 9.58f, 11.25f, 9.3f, 11.25f, 9f)
                verticalLineTo(2f)
                curveTo(11.25f, 1.59f, 11.59f, 1.25f, 12f, 1.25f)
                curveTo(12.41f, 1.25f, 12.75f, 1.59f, 12.75f, 2f)
                verticalLineTo(7.19f)
                lineTo(13.47f, 6.47f)
                curveTo(13.76f, 6.18f, 14.24f, 6.18f, 14.53f, 6.47f)
                curveTo(14.82f, 6.76f, 14.82f, 7.24f, 14.53f, 7.53f)
                lineTo(12.53f, 9.53f)
                curveTo(12.39f, 9.67f, 12.2f, 9.75f, 12f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 9.75f)
                curveTo(11.809f, 9.75f, 11.62f, 9.68f, 11.469f, 9.53f)
                lineTo(9.469f, 7.53f)
                curveTo(9.179f, 7.24f, 9.179f, 6.76f, 9.469f, 6.47f)
                curveTo(9.759f, 6.18f, 10.24f, 6.18f, 10.53f, 6.47f)
                lineTo(12.53f, 8.47f)
                curveTo(12.819f, 8.76f, 12.819f, 9.24f, 12.53f, 9.53f)
                curveTo(12.38f, 9.68f, 12.189f, 9.75f, 12f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.76f, 17.75f)
                horizontalLineTo(10.231f)
                curveTo(9.18f, 17.75f, 8.24f, 17.17f, 7.77f, 16.23f)
                lineTo(6.6f, 13.89f)
                curveTo(6.56f, 13.8f, 6.47f, 13.75f, 6.38f, 13.75f)
                horizontalLineTo(1.98f)
                curveTo(1.57f, 13.75f, 1.23f, 13.41f, 1.23f, 13f)
                curveTo(1.23f, 12.59f, 1.57f, 12.25f, 1.98f, 12.25f)
                horizontalLineTo(6.39f)
                curveTo(7.06f, 12.25f, 7.66f, 12.62f, 7.96f, 13.22f)
                lineTo(9.13f, 15.56f)
                curveTo(9.34f, 15.99f, 9.77f, 16.25f, 10.25f, 16.25f)
                horizontalLineTo(13.781f)
                curveTo(14.26f, 16.25f, 14.691f, 15.99f, 14.901f, 15.56f)
                lineTo(16.07f, 13.22f)
                curveTo(16.371f, 12.62f, 16.971f, 12.25f, 17.64f, 12.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 12.25f, 22.75f, 12.59f, 22.75f, 13f)
                curveTo(22.75f, 13.41f, 22.41f, 13.75f, 22f, 13.75f)
                horizontalLineTo(17.64f)
                curveTo(17.541f, 13.75f, 17.461f, 13.8f, 17.42f, 13.89f)
                lineTo(16.25f, 16.23f)
                curveTo(15.75f, 17.17f, 14.811f, 17.75f, 13.76f, 17.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(11f)
                curveTo(1.25f, 6.31f, 2.99f, 3.96f, 6.89f, 3.39f)
                curveTo(7.31f, 3.33f, 7.68f, 3.61f, 7.74f, 4.02f)
                curveTo(7.8f, 4.43f, 7.52f, 4.81f, 7.11f, 4.87f)
                curveTo(3.97f, 5.33f, 2.75f, 7.05f, 2.75f, 11f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(11f)
                curveTo(21.25f, 7.05f, 20.03f, 5.33f, 16.89f, 4.87f)
                curveTo(16.48f, 4.81f, 16.2f, 4.43f, 16.26f, 4.02f)
                curveTo(16.32f, 3.61f, 16.7f, 3.33f, 17.11f, 3.39f)
                curveTo(21.01f, 3.96f, 22.75f, 6.31f, 22.75f, 11f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
            }
        }.build()

        return _DirectInbox!!
    }

@Suppress("ObjectPropertyName")
private var _DirectInbox: ImageVector? = null
