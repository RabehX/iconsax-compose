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

val Iconsax.Outline.BitcoinCard: ImageVector
    get() {
        if (_BitcoinCard != null) {
            return _BitcoinCard!!
        }
        _BitcoinCard = ImageVector.Builder(
            name = "Outline.BitcoinCard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 9.25f)
                horizontalLineTo(2f)
                curveTo(1.59f, 9.25f, 1.25f, 8.91f, 1.25f, 8.5f)
                curveTo(1.25f, 8.09f, 1.59f, 7.75f, 2f, 7.75f)
                horizontalLineTo(13f)
                curveTo(13.41f, 7.75f, 13.75f, 8.09f, 13.75f, 8.5f)
                curveTo(13.75f, 8.91f, 13.41f, 9.25f, 13f, 9.25f)
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
                horizontalLineTo(13.28f)
                curveTo(13.69f, 2.75f, 14.03f, 3.09f, 14.03f, 3.5f)
                curveTo(14.03f, 3.91f, 13.69f, 4.25f, 13.28f, 4.25f)
                horizontalLineTo(6.44f)
                curveTo(3.3f, 4.25f, 2.75f, 4.79f, 2.75f, 7.89f)
                verticalLineTo(16.11f)
                curveTo(2.75f, 19.21f, 3.3f, 19.75f, 6.44f, 19.75f)
                horizontalLineTo(17.56f)
                curveTo(20.7f, 19.75f, 21.25f, 19.21f, 21.25f, 16.11f)
                verticalLineTo(11.33f)
                curveTo(21.25f, 10.92f, 21.59f, 10.58f, 22f, 10.58f)
                curveTo(22.41f, 10.58f, 22.75f, 10.92f, 22.75f, 11.33f)
                verticalLineTo(16.11f)
                curveTo(22.75f, 20.05f, 21.54f, 21.25f, 17.56f, 21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.12f, 6.5f)
                horizontalLineTo(17f)
                curveTo(16.59f, 6.5f, 16.25f, 6.16f, 16.25f, 5.75f)
                verticalLineTo(3.25f)
                curveTo(16.25f, 2.84f, 16.59f, 2.5f, 17f, 2.5f)
                horizontalLineTo(20.13f)
                curveTo(21.2f, 2.5f, 22.13f, 3.43f, 22.13f, 4.5f)
                curveTo(22.12f, 5.6f, 21.23f, 6.5f, 20.12f, 6.5f)
                close()
                moveTo(17.75f, 5f)
                horizontalLineTo(20.13f)
                curveTo(20.41f, 5f, 20.63f, 4.78f, 20.63f, 4.5f)
                curveTo(20.63f, 4.28f, 20.39f, 4f, 20.13f, 4f)
                horizontalLineTo(17.75f)
                verticalLineTo(5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.57f, 9f)
                horizontalLineTo(17f)
                curveTo(16.59f, 9f, 16.25f, 8.66f, 16.25f, 8.25f)
                verticalLineTo(5.75f)
                curveTo(16.25f, 5.34f, 16.59f, 5f, 17f, 5f)
                horizontalLineTo(20.57f)
                curveTo(21.77f, 5f, 22.75f, 5.9f, 22.75f, 7f)
                curveTo(22.75f, 8.1f, 21.77f, 9f, 20.57f, 9f)
                close()
                moveTo(17.75f, 7.5f)
                horizontalLineTo(20.57f)
                curveTo(20.94f, 7.5f, 21.25f, 7.27f, 21.25f, 7f)
                curveTo(21.25f, 6.73f, 20.94f, 6.5f, 20.57f, 6.5f)
                horizontalLineTo(17.75f)
                verticalLineTo(7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.76f, 10.25f)
                curveTo(18.35f, 10.25f, 18.01f, 9.91f, 18.01f, 9.5f)
                verticalLineTo(8.25f)
                curveTo(18.01f, 7.84f, 18.35f, 7.5f, 18.76f, 7.5f)
                curveTo(19.17f, 7.5f, 19.51f, 7.84f, 19.51f, 8.25f)
                verticalLineTo(9.5f)
                curveTo(19.51f, 9.92f, 19.18f, 10.25f, 18.76f, 10.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.76f, 4f)
                curveTo(18.35f, 4f, 18.01f, 3.66f, 18.01f, 3.25f)
                verticalLineTo(2f)
                curveTo(18.01f, 1.59f, 18.35f, 1.25f, 18.76f, 1.25f)
                curveTo(19.17f, 1.25f, 19.51f, 1.59f, 19.51f, 2f)
                verticalLineTo(3.25f)
                curveTo(19.51f, 3.66f, 19.18f, 4f, 18.76f, 4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.19f, 4f)
                horizontalLineTo(16f)
                curveTo(15.59f, 4f, 15.25f, 3.66f, 15.25f, 3.25f)
                curveTo(15.25f, 2.84f, 15.59f, 2.5f, 16f, 2.5f)
                horizontalLineTo(18.19f)
                curveTo(18.6f, 2.5f, 18.94f, 2.84f, 18.94f, 3.25f)
                curveTo(18.94f, 3.66f, 18.6f, 4f, 18.19f, 4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.19f, 9f)
                horizontalLineTo(16f)
                curveTo(15.59f, 9f, 15.25f, 8.66f, 15.25f, 8.25f)
                curveTo(15.25f, 7.84f, 15.59f, 7.5f, 16f, 7.5f)
                horizontalLineTo(18.19f)
                curveTo(18.6f, 7.5f, 18.94f, 7.84f, 18.94f, 8.25f)
                curveTo(18.94f, 8.66f, 18.6f, 9f, 18.19f, 9f)
                close()
            }
        }.build()

        return _BitcoinCard!!
    }

@Suppress("ObjectPropertyName")
private var _BitcoinCard: ImageVector? = null
