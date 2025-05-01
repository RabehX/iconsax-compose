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

val Iconsax.Outline.Coin: ImageVector
    get() {
        if (_Coin != null) {
            return _Coin!!
        }
        _Coin = ImageVector.Builder(
            name = "Outline.Coin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.84f, 13.54f)
                horizontalLineTo(9.34f)
                curveTo(8.19f, 13.54f, 7.26f, 12.58f, 7.26f, 11.39f)
                curveTo(7.26f, 10.98f, 7.6f, 10.64f, 8.01f, 10.64f)
                curveTo(8.42f, 10.64f, 8.76f, 10.98f, 8.76f, 11.39f)
                curveTo(8.76f, 11.75f, 9.02f, 12.04f, 9.34f, 12.04f)
                horizontalLineTo(10.84f)
                curveTo(11.07f, 12.04f, 11.25f, 11.83f, 11.25f, 11.57f)
                curveTo(11.25f, 11.22f, 11.19f, 11.2f, 10.96f, 11.12f)
                lineTo(8.55f, 10.28f)
                curveTo(7.68f, 9.98f, 7.25f, 9.37f, 7.25f, 8.42f)
                curveTo(7.25f, 7.34f, 8.11f, 6.45f, 9.16f, 6.45f)
                horizontalLineTo(10.66f)
                curveTo(11.81f, 6.45f, 12.74f, 7.41f, 12.74f, 8.6f)
                curveTo(12.74f, 9.01f, 12.4f, 9.35f, 11.99f, 9.35f)
                curveTo(11.58f, 9.35f, 11.24f, 9.01f, 11.24f, 8.6f)
                curveTo(11.24f, 8.24f, 10.98f, 7.95f, 10.66f, 7.95f)
                horizontalLineTo(9.16f)
                curveTo(8.93f, 7.95f, 8.75f, 8.16f, 8.75f, 8.42f)
                curveTo(8.75f, 8.77f, 8.81f, 8.79f, 9.04f, 8.87f)
                lineTo(11.45f, 9.71f)
                curveTo(12.32f, 10.02f, 12.74f, 10.63f, 12.74f, 11.57f)
                curveTo(12.75f, 12.66f, 11.89f, 13.54f, 10.84f, 13.54f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 14.34f)
                curveTo(9.59f, 14.34f, 9.25f, 14f, 9.25f, 13.59f)
                verticalLineTo(12.85f)
                curveTo(9.25f, 12.44f, 9.59f, 12.1f, 10f, 12.1f)
                curveTo(10.41f, 12.1f, 10.75f, 12.44f, 10.75f, 12.85f)
                verticalLineTo(13.59f)
                curveTo(10.75f, 14.01f, 10.41f, 14.34f, 10f, 14.34f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 7.94f)
                curveTo(9.59f, 7.94f, 9.25f, 7.6f, 9.25f, 7.19f)
                verticalLineTo(6.41f)
                curveTo(9.25f, 6f, 9.59f, 5.66f, 10f, 5.66f)
                curveTo(10.41f, 5.66f, 10.75f, 6f, 10.75f, 6.41f)
                verticalLineTo(7.19f)
                curveTo(10.75f, 7.6f, 10.41f, 7.94f, 10f, 7.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.99f, 18.72f)
                curveTo(5.17f, 18.72f, 1.25f, 14.8f, 1.25f, 9.98f)
                curveTo(1.25f, 5.16f, 5.17f, 1.24f, 9.99f, 1.24f)
                curveTo(14.81f, 1.24f, 18.73f, 5.16f, 18.73f, 9.98f)
                curveTo(18.73f, 14.8f, 14.8f, 18.72f, 9.99f, 18.72f)
                close()
                moveTo(9.99f, 2.75f)
                curveTo(6f, 2.75f, 2.75f, 6f, 2.75f, 9.99f)
                curveTo(2.75f, 13.98f, 6f, 17.22f, 9.99f, 17.22f)
                curveTo(13.98f, 17.22f, 17.23f, 13.97f, 17.23f, 9.98f)
                curveTo(17.23f, 5.99f, 13.98f, 2.75f, 9.99f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.019f, 22.72f)
                curveTo(15.169f, 22.72f, 13.429f, 21.82f, 12.359f, 20.3f)
                curveTo(12.119f, 19.96f, 12.199f, 19.49f, 12.539f, 19.25f)
                curveTo(12.879f, 19.01f, 13.349f, 19.09f, 13.589f, 19.43f)
                curveTo(14.379f, 20.55f, 15.659f, 21.21f, 17.019f, 21.21f)
                curveTo(19.339f, 21.21f, 21.219f, 19.33f, 21.219f, 17.01f)
                curveTo(21.219f, 15.66f, 20.559f, 14.38f, 19.459f, 13.59f)
                curveTo(19.119f, 13.35f, 19.049f, 12.88f, 19.289f, 12.54f)
                curveTo(19.529f, 12.2f, 19.999f, 12.13f, 20.339f, 12.37f)
                curveTo(21.829f, 13.44f, 22.719f, 15.17f, 22.719f, 17.01f)
                curveTo(22.719f, 20.17f, 20.169f, 22.72f, 17.019f, 22.72f)
                close()
            }
        }.build()

        return _Coin!!
    }

@Suppress("ObjectPropertyName")
private var _Coin: ImageVector? = null
