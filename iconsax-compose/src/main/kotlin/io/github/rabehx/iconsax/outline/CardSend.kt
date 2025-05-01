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

val Iconsax.Outline.CardSend: ImageVector
    get() {
        if (_CardSend != null) {
            return _CardSend!!
        }
        _CardSend = ImageVector.Builder(
            name = "Outline.CardSend",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.5f, 9.25f)
                horizontalLineTo(2f)
                curveTo(1.59f, 9.25f, 1.25f, 8.91f, 1.25f, 8.5f)
                curveTo(1.25f, 8.09f, 1.59f, 7.75f, 2f, 7.75f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 7.75f, 15.25f, 8.09f, 15.25f, 8.5f)
                curveTo(15.25f, 8.91f, 14.91f, 9.25f, 14.5f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 17.25f)
                horizontalLineTo(6f)
                curveTo(5.59f, 17.25f, 5.25f, 16.91f, 5.25f, 16.5f)
                curveTo(5.25f, 16.09f, 5.59f, 15.75f, 6f, 15.75f)
                horizontalLineTo(8f)
                curveTo(8.41f, 15.75f, 8.75f, 16.09f, 8.75f, 16.5f)
                curveTo(8.75f, 16.91f, 8.41f, 17.25f, 8f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.5f, 17.25f)
                horizontalLineTo(10.5f)
                curveTo(10.09f, 17.25f, 9.75f, 16.91f, 9.75f, 16.5f)
                curveTo(9.75f, 16.09f, 10.09f, 15.75f, 10.5f, 15.75f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 15.75f, 15.25f, 16.09f, 15.25f, 16.5f)
                curveTo(15.25f, 16.91f, 14.91f, 17.25f, 14.5f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.56f, 21.25f)
                horizontalLineTo(6.44f)
                curveTo(2.46f, 21.25f, 1.25f, 20.05f, 1.25f, 16.11f)
                verticalLineTo(7.89f)
                curveTo(1.25f, 3.95f, 2.46f, 2.75f, 6.44f, 2.75f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 2.75f, 15.25f, 3.09f, 15.25f, 3.5f)
                curveTo(15.25f, 3.91f, 14.91f, 4.25f, 14.5f, 4.25f)
                horizontalLineTo(6.44f)
                curveTo(3.3f, 4.25f, 2.75f, 4.79f, 2.75f, 7.89f)
                verticalLineTo(16.1f)
                curveTo(2.75f, 19.2f, 3.3f, 19.74f, 6.44f, 19.74f)
                horizontalLineTo(17.55f)
                curveTo(20.69f, 19.74f, 21.24f, 19.2f, 21.24f, 16.1f)
                verticalLineTo(14.02f)
                curveTo(21.24f, 13.61f, 21.58f, 13.27f, 21.99f, 13.27f)
                curveTo(22.4f, 13.27f, 22.74f, 13.61f, 22.74f, 14.02f)
                verticalLineTo(16.1f)
                curveTo(22.75f, 20.05f, 21.54f, 21.25f, 17.56f, 21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 10.25f)
                curveTo(19.59f, 10.25f, 19.25f, 9.91f, 19.25f, 9.5f)
                verticalLineTo(3.5f)
                curveTo(19.25f, 3.2f, 19.43f, 2.92f, 19.71f, 2.81f)
                curveTo(19.99f, 2.7f, 20.31f, 2.76f, 20.53f, 2.97f)
                lineTo(22.53f, 4.97f)
                curveTo(22.82f, 5.26f, 22.82f, 5.74f, 22.53f, 6.03f)
                curveTo(22.24f, 6.32f, 21.76f, 6.32f, 21.47f, 6.03f)
                lineTo(20.75f, 5.31f)
                verticalLineTo(9.5f)
                curveTo(20.75f, 9.91f, 20.41f, 10.25f, 20f, 10.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 6.25f)
                curveTo(17.809f, 6.25f, 17.619f, 6.18f, 17.469f, 6.03f)
                curveTo(17.18f, 5.74f, 17.18f, 5.26f, 17.469f, 4.97f)
                lineTo(19.469f, 2.97f)
                curveTo(19.76f, 2.68f, 20.24f, 2.68f, 20.529f, 2.97f)
                curveTo(20.819f, 3.26f, 20.819f, 3.74f, 20.529f, 4.03f)
                lineTo(18.529f, 6.03f)
                curveTo(18.379f, 6.18f, 18.19f, 6.25f, 18f, 6.25f)
                close()
            }
        }.build()

        return _CardSend!!
    }

@Suppress("ObjectPropertyName")
private var _CardSend: ImageVector? = null
