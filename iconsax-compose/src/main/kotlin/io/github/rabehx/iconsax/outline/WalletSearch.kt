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

val Iconsax.Outline.WalletSearch: ImageVector
    get() {
        if (_WalletSearch != null) {
            return _WalletSearch!!
        }
        _WalletSearch = ImageVector.Builder(
            name = "Outline.WalletSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 22.75f)
                horizontalLineTo(12f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22f)
                curveTo(11.25f, 21.59f, 11.59f, 21.25f, 12f, 21.25f)
                horizontalLineTo(17f)
                curveTo(19.58f, 21.25f, 21.25f, 19.58f, 21.25f, 17f)
                verticalLineTo(12f)
                curveTo(21.25f, 9.71f, 19.83f, 8f, 17.71f, 7.75f)
                horizontalLineTo(17f)
                horizontalLineTo(7f)
                curveTo(6.72f, 7.75f, 6.62f, 7.75f, 6.44f, 7.81f)
                curveTo(6.39f, 7.83f, 6.34f, 7.84f, 6.29f, 7.84f)
                curveTo(4.08f, 8.1f, 2.75f, 9.65f, 2.75f, 12f)
                verticalLineTo(13f)
                curveTo(2.75f, 13.41f, 2.41f, 13.75f, 2f, 13.75f)
                curveTo(1.59f, 13.75f, 1.25f, 13.41f, 1.25f, 13f)
                verticalLineTo(12f)
                curveTo(1.25f, 8.94f, 3.13f, 6.73f, 6.04f, 6.36f)
                curveTo(6.42f, 6.25f, 6.7f, 6.25f, 7f, 6.25f)
                horizontalLineTo(17.8f)
                curveTo(20.8f, 6.6f, 22.75f, 8.91f, 22.75f, 12f)
                verticalLineTo(17f)
                curveTo(22.75f, 20.44f, 20.44f, 22.75f, 17f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.2f, 7.85f)
                curveTo(6f, 7.85f, 5.81f, 7.77f, 5.67f, 7.63f)
                curveTo(5.47f, 7.43f, 5.4f, 7.13f, 5.49f, 6.86f)
                curveTo(5.65f, 6.39f, 5.94f, 6.1f, 6.27f, 5.77f)
                lineTo(9.46f, 2.48f)
                curveTo(11.11f, 0.83f, 13.89f, 0.83f, 15.53f, 2.47f)
                lineTo(17.33f, 4.27f)
                curveTo(17.99f, 4.93f, 18.41f, 5.84f, 18.54f, 6.91f)
                curveTo(18.57f, 7.12f, 18.5f, 7.34f, 18.36f, 7.5f)
                curveTo(18.22f, 7.66f, 18.01f, 7.75f, 17.8f, 7.75f)
                horizontalLineTo(7f)
                curveTo(6.72f, 7.75f, 6.62f, 7.75f, 6.44f, 7.81f)
                curveTo(6.36f, 7.84f, 6.28f, 7.85f, 6.2f, 7.85f)
                close()
                moveTo(7.89f, 6.25f)
                horizontalLineTo(16.85f)
                curveTo(16.73f, 5.93f, 16.54f, 5.61f, 16.27f, 5.33f)
                lineTo(14.47f, 3.53f)
                curveTo(13.4f, 2.46f, 11.6f, 2.46f, 10.53f, 3.53f)
                lineTo(7.89f, 6.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 17.25f)
                horizontalLineTo(19f)
                curveTo(17.48f, 17.25f, 16.25f, 16.02f, 16.25f, 14.5f)
                curveTo(16.25f, 12.98f, 17.48f, 11.75f, 19f, 11.75f)
                horizontalLineTo(22f)
                curveTo(22.41f, 11.75f, 22.75f, 12.09f, 22.75f, 12.5f)
                curveTo(22.75f, 12.91f, 22.41f, 13.25f, 22f, 13.25f)
                horizontalLineTo(19f)
                curveTo(18.31f, 13.25f, 17.75f, 13.81f, 17.75f, 14.5f)
                curveTo(17.75f, 15.19f, 18.31f, 15.75f, 19f, 15.75f)
                horizontalLineTo(22f)
                curveTo(22.41f, 15.75f, 22.75f, 16.09f, 22.75f, 16.5f)
                curveTo(22.75f, 16.91f, 22.41f, 17.25f, 22f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.8f, 22.15f)
                curveTo(3.62f, 22.15f, 1.85f, 20.38f, 1.85f, 18.2f)
                curveTo(1.85f, 16.02f, 3.62f, 14.25f, 5.8f, 14.25f)
                curveTo(7.98f, 14.25f, 9.75f, 16.02f, 9.75f, 18.2f)
                curveTo(9.75f, 20.38f, 7.98f, 22.15f, 5.8f, 22.15f)
                close()
                moveTo(5.8f, 15.75f)
                curveTo(4.45f, 15.75f, 3.35f, 16.85f, 3.35f, 18.2f)
                curveTo(3.35f, 19.55f, 4.45f, 20.65f, 5.8f, 20.65f)
                curveTo(7.15f, 20.65f, 8.25f, 19.55f, 8.25f, 18.2f)
                curveTo(8.25f, 16.85f, 7.15f, 15.75f, 5.8f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(1.999f, 22.75f)
                curveTo(1.809f, 22.75f, 1.619f, 22.68f, 1.469f, 22.53f)
                curveTo(1.179f, 22.24f, 1.179f, 21.76f, 1.469f, 21.47f)
                lineTo(2.469f, 20.47f)
                curveTo(2.759f, 20.18f, 3.239f, 20.18f, 3.529f, 20.47f)
                curveTo(3.819f, 20.76f, 3.819f, 21.24f, 3.529f, 21.53f)
                lineTo(2.529f, 22.53f)
                curveTo(2.379f, 22.68f, 2.189f, 22.75f, 1.999f, 22.75f)
                close()
            }
        }.build()

        return _WalletSearch!!
    }

@Suppress("ObjectPropertyName")
private var _WalletSearch: ImageVector? = null
