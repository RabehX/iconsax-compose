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


val Iconsax.Filled.Hashtag: ImageVector
    get() {
        if (_Hashtag != null) {
            return _Hashtag!!
        }
        _Hashtag = ImageVector.Builder(
            name = "Filled.Hashtag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.42f, 13.418f)
                horizontalLineTo(13.26f)
                lineTo(13.58f, 10.578f)
                horizontalLineTo(10.74f)
                lineTo(10.42f, 13.418f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(18.82f, 10.58f)
                horizontalLineTo(15.05f)
                lineTo(14.73f, 13.43f)
                horizontalLineTo(18.1f)
                curveTo(18.5f, 13.43f, 18.83f, 13.76f, 18.83f, 14.16f)
                curveTo(18.83f, 14.56f, 18.5f, 14.89f, 18.1f, 14.89f)
                horizontalLineTo(14.57f)
                lineTo(14.16f, 18.55f)
                curveTo(14.12f, 18.92f, 13.8f, 19.2f, 13.43f, 19.2f)
                curveTo(13.4f, 19.2f, 13.38f, 19.2f, 13.35f, 19.2f)
                curveTo(12.95f, 19.16f, 12.66f, 18.79f, 12.7f, 18.39f)
                lineTo(13.09f, 14.89f)
                horizontalLineTo(10.25f)
                lineTo(9.84f, 18.55f)
                curveTo(9.8f, 18.92f, 9.48f, 19.2f, 9.11f, 19.2f)
                curveTo(9.08f, 19.2f, 9.06f, 19.2f, 9.03f, 19.2f)
                curveTo(8.63f, 19.16f, 8.34f, 18.79f, 8.38f, 18.39f)
                lineTo(8.77f, 14.89f)
                horizontalLineTo(5.18f)
                curveTo(4.78f, 14.89f, 4.45f, 14.56f, 4.45f, 14.16f)
                curveTo(4.45f, 13.76f, 4.78f, 13.43f, 5.18f, 13.43f)
                horizontalLineTo(8.95f)
                lineTo(9.27f, 10.58f)
                horizontalLineTo(5.9f)
                curveTo(5.5f, 10.58f, 5.17f, 10.25f, 5.17f, 9.85f)
                curveTo(5.17f, 9.45f, 5.5f, 9.12f, 5.9f, 9.12f)
                horizontalLineTo(9.43f)
                lineTo(9.84f, 5.46f)
                curveTo(9.88f, 5.06f, 10.25f, 4.77f, 10.65f, 4.81f)
                curveTo(11.05f, 4.85f, 11.34f, 5.22f, 11.3f, 5.62f)
                lineTo(10.91f, 9.12f)
                horizontalLineTo(13.75f)
                lineTo(14.16f, 5.46f)
                curveTo(14.21f, 5.06f, 14.57f, 4.77f, 14.97f, 4.81f)
                curveTo(15.37f, 4.85f, 15.66f, 5.22f, 15.62f, 5.62f)
                lineTo(15.23f, 9.12f)
                horizontalLineTo(18.84f)
                curveTo(19.24f, 9.12f, 19.57f, 9.45f, 19.57f, 9.85f)
                curveTo(19.57f, 10.25f, 19.22f, 10.58f, 18.82f, 10.58f)
                close()
            }
        }.build()

        return _Hashtag!!
    }

@Suppress("ObjectPropertyName")
private var _Hashtag: ImageVector? = null
