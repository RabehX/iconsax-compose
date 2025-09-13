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

val Iconsax.Outline.Wallet2: ImageVector
    get() {
        if (_Wallet2 != null) {
            return _Wallet2!!
        }
        _Wallet2 = ImageVector.Builder(
            name = "Outline.Wallet2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 9.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 9.75f, 6.25f, 9.41f, 6.25f, 9f)
                curveTo(6.25f, 8.59f, 6.59f, 8.25f, 7f, 8.25f)
                horizontalLineTo(13f)
                curveTo(13.41f, 8.25f, 13.75f, 8.59f, 13.75f, 9f)
                curveTo(13.75f, 9.41f, 13.41f, 9.75f, 13f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.04f, 14.8f)
                curveTo(17.53f, 14.8f, 16.25f, 13.68f, 16.13f, 12.24f)
                curveTo(16.05f, 11.41f, 16.35f, 10.6f, 16.95f, 10.01f)
                curveTo(17.45f, 9.49f, 18.16f, 9.2f, 18.91f, 9.2f)
                horizontalLineTo(21f)
                curveTo(21.99f, 9.23f, 22.75f, 10.01f, 22.75f, 10.97f)
                verticalLineTo(13.03f)
                curveTo(22.75f, 13.99f, 21.99f, 14.77f, 21.03f, 14.8f)
                horizontalLineTo(19.04f)
                close()
                moveTo(20.97f, 10.7f)
                horizontalLineTo(18.92f)
                curveTo(18.57f, 10.7f, 18.25f, 10.83f, 18.02f, 11.07f)
                curveTo(17.73f, 11.35f, 17.59f, 11.73f, 17.63f, 12.11f)
                curveTo(17.68f, 12.77f, 18.32f, 13.3f, 19.04f, 13.3f)
                horizontalLineTo(21f)
                curveTo(21.13f, 13.3f, 21.25f, 13.18f, 21.25f, 13.03f)
                verticalLineTo(10.97f)
                curveTo(21.25f, 10.82f, 21.13f, 10.71f, 20.97f, 10.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 21.25f)
                horizontalLineTo(7f)
                curveTo(3.56f, 21.25f, 1.25f, 18.94f, 1.25f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(1.25f, 5.42f, 3.15f, 3.19f, 6.1f, 2.82f)
                curveTo(6.37f, 2.78f, 6.68f, 2.75f, 7f, 2.75f)
                horizontalLineTo(16f)
                curveTo(16.24f, 2.75f, 16.55f, 2.76f, 16.87f, 2.81f)
                curveTo(19.82f, 3.15f, 21.75f, 5.39f, 21.75f, 8.5f)
                verticalLineTo(9.95f)
                curveTo(21.75f, 10.36f, 21.41f, 10.7f, 21f, 10.7f)
                horizontalLineTo(18.92f)
                curveTo(18.57f, 10.7f, 18.25f, 10.83f, 18.02f, 11.07f)
                lineTo(18.01f, 11.08f)
                curveTo(17.73f, 11.35f, 17.6f, 11.72f, 17.63f, 12.1f)
                curveTo(17.68f, 12.76f, 18.32f, 13.29f, 19.04f, 13.29f)
                horizontalLineTo(21f)
                curveTo(21.41f, 13.29f, 21.75f, 13.63f, 21.75f, 14.04f)
                verticalLineTo(15.49f)
                curveTo(21.75f, 18.94f, 19.44f, 21.25f, 16f, 21.25f)
                close()
                moveTo(7f, 4.25f)
                curveTo(6.76f, 4.25f, 6.53f, 4.27f, 6.3f, 4.3f)
                curveTo(4.1f, 4.58f, 2.75f, 6.18f, 2.75f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2.75f, 18.08f, 4.42f, 19.75f, 7f, 19.75f)
                horizontalLineTo(16f)
                curveTo(18.58f, 19.75f, 20.25f, 18.08f, 20.25f, 15.5f)
                verticalLineTo(14.8f)
                horizontalLineTo(19.04f)
                curveTo(17.53f, 14.8f, 16.25f, 13.68f, 16.13f, 12.24f)
                curveTo(16.05f, 11.42f, 16.35f, 10.6f, 16.95f, 10.02f)
                curveTo(17.47f, 9.49f, 18.17f, 9.2f, 18.92f, 9.2f)
                horizontalLineTo(20.25f)
                verticalLineTo(8.5f)
                curveTo(20.25f, 6.16f, 18.88f, 4.55f, 16.66f, 4.29f)
                curveTo(16.42f, 4.25f, 16.21f, 4.25f, 16f, 4.25f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _Wallet2!!
    }

@Suppress("ObjectPropertyName")
private var _Wallet2: ImageVector? = null
