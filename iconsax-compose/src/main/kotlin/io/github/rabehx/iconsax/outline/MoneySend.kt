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

val Iconsax.Outline.MoneySend: ImageVector
    get() {
        if (_MoneySend != null) {
            return _MoneySend!!
        }
        _MoneySend = ImageVector.Builder(
            name = "Outline.MoneySend",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.05f, 16.25f)
                horizontalLineTo(11.17f)
                curveTo(9.84f, 16.25f, 8.75f, 15.13f, 8.75f, 13.75f)
                curveTo(8.75f, 13.34f, 9.09f, 13f, 9.5f, 13f)
                curveTo(9.91f, 13f, 10.25f, 13.34f, 10.25f, 13.75f)
                curveTo(10.25f, 14.3f, 10.66f, 14.75f, 11.17f, 14.75f)
                horizontalLineTo(13.05f)
                curveTo(13.44f, 14.75f, 13.75f, 14.4f, 13.75f, 13.97f)
                curveTo(13.75f, 13.43f, 13.6f, 13.35f, 13.26f, 13.23f)
                lineTo(10.25f, 12.18f)
                curveTo(9.61f, 11.95f, 8.75f, 11.49f, 8.75f, 10.02f)
                curveTo(8.75f, 8.77f, 9.74f, 7.74f, 10.95f, 7.74f)
                horizontalLineTo(12.83f)
                curveTo(14.16f, 7.74f, 15.25f, 8.86f, 15.25f, 10.24f)
                curveTo(15.25f, 10.65f, 14.91f, 10.99f, 14.5f, 10.99f)
                curveTo(14.09f, 10.99f, 13.75f, 10.65f, 13.75f, 10.24f)
                curveTo(13.75f, 9.69f, 13.34f, 9.24f, 12.83f, 9.24f)
                horizontalLineTo(10.95f)
                curveTo(10.56f, 9.24f, 10.25f, 9.59f, 10.25f, 10.02f)
                curveTo(10.25f, 10.56f, 10.4f, 10.64f, 10.74f, 10.76f)
                lineTo(13.75f, 11.81f)
                curveTo(14.39f, 12.04f, 15.25f, 12.5f, 15.25f, 13.97f)
                curveTo(15.25f, 15.23f, 14.26f, 16.25f, 13.05f, 16.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 17.25f)
                curveTo(11.59f, 17.25f, 11.25f, 16.91f, 11.25f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(11.25f, 7.09f, 11.59f, 6.75f, 12f, 6.75f)
                curveTo(12.41f, 6.75f, 12.75f, 7.09f, 12.75f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(12.75f, 16.91f, 12.41f, 17.25f, 12f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(12.41f, 1.25f, 12.75f, 1.59f, 12.75f, 2f)
                curveTo(12.75f, 2.41f, 12.41f, 2.75f, 12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 11.59f, 21.59f, 11.25f, 22f, 11.25f)
                curveTo(22.41f, 11.25f, 22.75f, 11.59f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 6.75f)
                curveTo(21.59f, 6.75f, 21.25f, 6.41f, 21.25f, 6f)
                verticalLineTo(2.75f)
                horizontalLineTo(18f)
                curveTo(17.59f, 2.75f, 17.25f, 2.41f, 17.25f, 2f)
                curveTo(17.25f, 1.59f, 17.59f, 1.25f, 18f, 1.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 1.25f, 22.75f, 1.59f, 22.75f, 2f)
                verticalLineTo(6f)
                curveTo(22.75f, 6.41f, 22.41f, 6.75f, 22f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 7.75f)
                curveTo(16.809f, 7.75f, 16.619f, 7.68f, 16.469f, 7.53f)
                curveTo(16.18f, 7.24f, 16.18f, 6.76f, 16.469f, 6.47f)
                lineTo(21.469f, 1.47f)
                curveTo(21.76f, 1.18f, 22.24f, 1.18f, 22.529f, 1.47f)
                curveTo(22.819f, 1.76f, 22.819f, 2.24f, 22.529f, 2.53f)
                lineTo(17.529f, 7.53f)
                curveTo(17.379f, 7.68f, 17.19f, 7.75f, 17f, 7.75f)
                close()
            }
        }.build()

        return _MoneySend!!
    }

@Suppress("ObjectPropertyName")
private var _MoneySend: ImageVector? = null
