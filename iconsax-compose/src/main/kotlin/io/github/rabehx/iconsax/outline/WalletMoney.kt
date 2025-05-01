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

val Iconsax.Outline.WalletMoney: ImageVector
    get() {
        if (_WalletMoney != null) {
            return _WalletMoney!!
        }
        _WalletMoney = ImageVector.Builder(
            name = "Outline.WalletMoney",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.17f, 22.75f)
                curveTo(4.79f, 22.75f, 2.84f, 21.02f, 2.84f, 18.89f)
                verticalLineTo(16.85f)
                curveTo(2.84f, 16.44f, 3.18f, 16.1f, 3.59f, 16.1f)
                curveTo(4f, 16.1f, 4.34f, 16.44f, 4.34f, 16.85f)
                curveTo(4.34f, 18.1f, 5.55f, 19.04f, 7.17f, 19.04f)
                curveTo(8.79f, 19.04f, 10f, 18.1f, 10f, 16.85f)
                curveTo(10f, 16.44f, 10.34f, 16.1f, 10.75f, 16.1f)
                curveTo(11.16f, 16.1f, 11.5f, 16.44f, 11.5f, 16.85f)
                verticalLineTo(18.89f)
                curveTo(11.5f, 21.02f, 9.56f, 22.75f, 7.17f, 22.75f)
                close()
                moveTo(4.6f, 19.87f)
                curveTo(5.04f, 20.69f, 6.03f, 21.25f, 7.17f, 21.25f)
                curveTo(8.31f, 21.25f, 9.3f, 20.68f, 9.74f, 19.87f)
                curveTo(9.03f, 20.3f, 8.15f, 20.55f, 7.17f, 20.55f)
                curveTo(6.19f, 20.55f, 5.31f, 20.3f, 4.6f, 19.87f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.17f, 17.8f)
                curveTo(5.53f, 17.8f, 4.06f, 17.05f, 3.33f, 15.86f)
                curveTo(3.01f, 15.34f, 2.84f, 14.73f, 2.84f, 14.11f)
                curveTo(2.84f, 13.06f, 3.3f, 12.08f, 4.14f, 11.35f)
                curveTo(5.76f, 9.93f, 8.55f, 9.93f, 10.18f, 11.34f)
                curveTo(11.02f, 12.08f, 11.49f, 13.06f, 11.49f, 14.11f)
                curveTo(11.49f, 14.73f, 11.32f, 15.34f, 11f, 15.86f)
                curveTo(10.28f, 17.05f, 8.81f, 17.8f, 7.17f, 17.8f)
                close()
                moveTo(7.17f, 11.75f)
                curveTo(6.39f, 11.75f, 5.67f, 12.01f, 5.13f, 12.48f)
                curveTo(4.62f, 12.92f, 4.34f, 13.5f, 4.34f, 14.11f)
                curveTo(4.34f, 14.46f, 4.43f, 14.78f, 4.61f, 15.08f)
                curveTo(5.07f, 15.84f, 6.05f, 16.31f, 7.17f, 16.31f)
                curveTo(8.29f, 16.31f, 9.27f, 15.84f, 9.72f, 15.09f)
                curveTo(9.9f, 14.8f, 9.99f, 14.47f, 9.99f, 14.12f)
                curveTo(9.99f, 13.51f, 9.71f, 12.93f, 9.2f, 12.48f)
                curveTo(8.67f, 12.01f, 7.95f, 11.75f, 7.17f, 11.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.17f, 20.55f)
                curveTo(4.7f, 20.55f, 2.84f, 18.96f, 2.84f, 16.86f)
                verticalLineTo(14.11f)
                curveTo(2.84f, 11.98f, 4.78f, 10.25f, 7.17f, 10.25f)
                curveTo(8.3f, 10.25f, 9.38f, 10.64f, 10.19f, 11.34f)
                curveTo(11.03f, 12.08f, 11.5f, 13.06f, 11.5f, 14.11f)
                verticalLineTo(16.86f)
                curveTo(11.5f, 18.96f, 9.64f, 20.55f, 7.17f, 20.55f)
                close()
                moveTo(7.17f, 11.75f)
                curveTo(5.61f, 11.75f, 4.34f, 12.81f, 4.34f, 14.11f)
                verticalLineTo(16.86f)
                curveTo(4.34f, 18.11f, 5.55f, 19.05f, 7.17f, 19.05f)
                curveTo(8.79f, 19.05f, 10f, 18.11f, 10f, 16.86f)
                verticalLineTo(14.11f)
                curveTo(10f, 13.5f, 9.72f, 12.92f, 9.21f, 12.47f)
                curveTo(8.67f, 12.01f, 7.95f, 11.75f, 7.17f, 11.75f)
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
                horizontalLineTo(13.5f)
                curveTo(13.09f, 21.25f, 12.75f, 20.91f, 12.75f, 20.5f)
                curveTo(12.75f, 20.09f, 13.09f, 19.75f, 13.5f, 19.75f)
                horizontalLineTo(16f)
                curveTo(18.58f, 19.75f, 20.25f, 18.08f, 20.25f, 15.5f)
                verticalLineTo(14.8f)
                horizontalLineTo(19.04f)
                curveTo(17.53f, 14.8f, 16.25f, 13.68f, 16.13f, 12.24f)
                curveTo(16.05f, 11.41f, 16.35f, 10.6f, 16.95f, 10.01f)
                curveTo(17.45f, 9.49f, 18.16f, 9.2f, 18.91f, 9.2f)
                horizontalLineTo(20.24f)
                verticalLineTo(8.5f)
                curveTo(20.24f, 6.16f, 18.87f, 4.55f, 16.65f, 4.29f)
                curveTo(16.41f, 4.25f, 16.2f, 4.25f, 15.99f, 4.25f)
                horizontalLineTo(6.99f)
                curveTo(6.75f, 4.25f, 6.52f, 4.27f, 6.29f, 4.3f)
                curveTo(4.09f, 4.58f, 2.74f, 6.18f, 2.74f, 8.5f)
                verticalLineTo(10.5f)
                curveTo(2.74f, 10.91f, 2.4f, 11.25f, 1.99f, 11.25f)
                curveTo(1.58f, 11.25f, 1.24f, 10.91f, 1.24f, 10.5f)
                verticalLineTo(8.5f)
                curveTo(1.24f, 5.42f, 3.14f, 3.19f, 6.09f, 2.82f)
                curveTo(6.36f, 2.78f, 6.67f, 2.75f, 6.99f, 2.75f)
                horizontalLineTo(15.99f)
                curveTo(16.23f, 2.75f, 16.54f, 2.76f, 16.86f, 2.81f)
                curveTo(19.81f, 3.15f, 21.74f, 5.39f, 21.74f, 8.5f)
                verticalLineTo(9.95f)
                curveTo(21.74f, 10.36f, 21.4f, 10.7f, 20.99f, 10.7f)
                horizontalLineTo(18.91f)
                curveTo(18.56f, 10.7f, 18.24f, 10.83f, 18.01f, 11.07f)
                curveTo(17.72f, 11.35f, 17.58f, 11.73f, 17.62f, 12.11f)
                curveTo(17.67f, 12.77f, 18.31f, 13.3f, 19.03f, 13.3f)
                horizontalLineTo(21f)
                curveTo(21.41f, 13.3f, 21.75f, 13.64f, 21.75f, 14.05f)
                verticalLineTo(15.5f)
                curveTo(21.75f, 18.94f, 19.44f, 21.25f, 16f, 21.25f)
                close()
            }
        }.build()

        return _WalletMoney!!
    }

@Suppress("ObjectPropertyName")
private var _WalletMoney: ImageVector? = null
