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


val Iconsax.Filled.EmptyWallet: ImageVector
    get() {
        if (_EmptyWallet != null) {
            return _EmptyWallet!!
        }
        _EmptyWallet = ImageVector.Builder(
            name = "Filled.EmptyWallet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.85f, 3.951f)
                verticalLineTo(7.751f)
                horizontalLineTo(13.35f)
                verticalLineTo(3.951f)
                curveTo(13.35f, 3.681f, 13.11f, 3.551f, 12.95f, 3.551f)
                curveTo(12.9f, 3.551f, 12.85f, 3.561f, 12.8f, 3.581f)
                lineTo(4.87f, 6.571f)
                curveTo(4.34f, 6.771f, 4f, 7.271f, 4f, 7.841f)
                verticalLineTo(8.511f)
                curveTo(3.09f, 9.191f, 2.5f, 10.281f, 2.5f, 11.511f)
                verticalLineTo(7.841f)
                curveTo(2.5f, 6.651f, 3.23f, 5.591f, 4.34f, 5.171f)
                lineTo(12.28f, 2.171f)
                curveTo(12.5f, 2.091f, 12.73f, 2.051f, 12.95f, 2.051f)
                curveTo(13.95f, 2.051f, 14.85f, 2.861f, 14.85f, 3.951f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.501f, 14.5f)
                verticalLineTo(15.5f)
                curveTo(21.501f, 15.77f, 21.291f, 15.99f, 21.011f, 16f)
                horizontalLineTo(19.551f)
                curveTo(19.021f, 16f, 18.541f, 15.61f, 18.501f, 15.09f)
                curveTo(18.471f, 14.78f, 18.591f, 14.49f, 18.791f, 14.29f)
                curveTo(18.971f, 14.1f, 19.221f, 14f, 19.491f, 14f)
                horizontalLineTo(21.001f)
                curveTo(21.291f, 14.01f, 21.501f, 14.23f, 21.501f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.48f, 12.95f)
                horizontalLineTo(20.5f)
                curveTo(21.05f, 12.95f, 21.5f, 12.5f, 21.5f, 11.95f)
                verticalLineTo(11.51f)
                curveTo(21.5f, 9.44f, 19.81f, 7.75f, 17.74f, 7.75f)
                horizontalLineTo(6.26f)
                curveTo(5.41f, 7.75f, 4.63f, 8.03f, 4f, 8.51f)
                curveTo(3.09f, 9.19f, 2.5f, 10.28f, 2.5f, 11.51f)
                verticalLineTo(18.24f)
                curveTo(2.5f, 20.31f, 4.19f, 22f, 6.26f, 22f)
                horizontalLineTo(17.74f)
                curveTo(19.81f, 22f, 21.5f, 20.31f, 21.5f, 18.24f)
                verticalLineTo(18.05f)
                curveTo(21.5f, 17.5f, 21.05f, 17.05f, 20.5f, 17.05f)
                horizontalLineTo(19.63f)
                curveTo(18.67f, 17.05f, 17.75f, 16.46f, 17.5f, 15.53f)
                curveTo(17.29f, 14.77f, 17.54f, 14.04f, 18.04f, 13.55f)
                curveTo(18.41f, 13.17f, 18.92f, 12.95f, 19.48f, 12.95f)
                close()
                moveTo(14f, 12.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 12.75f, 6.25f, 12.41f, 6.25f, 12f)
                curveTo(6.25f, 11.59f, 6.59f, 11.25f, 7f, 11.25f)
                horizontalLineTo(14f)
                curveTo(14.41f, 11.25f, 14.75f, 11.59f, 14.75f, 12f)
                curveTo(14.75f, 12.41f, 14.41f, 12.75f, 14f, 12.75f)
                close()
            }
        }.build()

        return _EmptyWallet!!
    }

@Suppress("ObjectPropertyName")
private var _EmptyWallet: ImageVector? = null
